package com.dbc.emailconsumidor.service;


import com.dbc.emailconsumidor.dto.EnviaEmailDTO;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender emailSender;

    @Value("${spring.mail.username}")
    private String remetente;

    private final Configuration configuration;


    public EnviaEmailDTO enviaEmail(EnviaEmailDTO enviaEmailDTO) throws MessagingException, IOException, TemplateException, TemplateException {
        MimeMessage mimeMessage = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(remetente);
        helper.setTo(enviaEmailDTO.getDestinatario());
        helper.setSubject("Usuario cadastrado");
        Template template = configuration.getTemplate("email-template.ftl");
        Map<String, Object> dados = new HashMap<>();
        dados.put("Destinatario", enviaEmailDTO.getDestinatario());
        dados.put("Assunto", enviaEmailDTO.getAssunto());
        dados.put("Texto", enviaEmailDTO.getTexto());

        String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, dados);
        helper.setText(html, true);
        emailSender.send(mimeMessage);
        return enviaEmailDTO;
    }

}

