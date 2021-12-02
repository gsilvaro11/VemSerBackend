package com.dbc.emailconsumidor.service;


import com.dbc.emailconsumidor.dto.EnviaEmailDTO;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;


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
        helper.setText(enviaEmailDTO.getTexto(), true);
        emailSender.send(mimeMessage);

        return enviaEmailDTO;
    }

}

