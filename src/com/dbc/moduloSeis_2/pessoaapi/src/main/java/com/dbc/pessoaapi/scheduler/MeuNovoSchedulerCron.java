package com.dbc.pessoaapi.scheduler;

import com.dbc.pessoaapi.entity.PessoaEntity;
import com.dbc.pessoaapi.repository.PessoaRepository;
import com.dbc.pessoaapi.service.EmailService;
import freemarker.template.TemplateException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class MeuNovoSchedulerCron {
    private final EmailService emailService;
    private final PessoaRepository pessoaRepository;
    private static final SimpleDateFormat dateFormat
            = new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(cron = "0 17-24 16,20 * * *")//, zone = "GMT-3")
//    public void meuPrimeiroScheduler() throws InterruptedException, MessagingException, TemplateException, IOException {
//        List<PessoaEntity> pessoas = pessoaRepository.pessoaSemEndereco();
//
//        if(!pessoas.isEmpty()){
//            for(PessoaEntity p : pessoas){
//                emailService.enviarCadastroReserva(p,"email-template.ftl");
//            }
//        }
//    }

//    @Scheduled(cron = "0 33-34 16,20 * * *")//, zone = "GMT-3")
//    public void scheduleMarketing() throws InterruptedException, MessagingException, TemplateException, IOException {
//        List<PessoaEntity> pessoas = pessoaRepository.findAll();
//
//        if(!pessoas.isEmpty()){
//            for(PessoaEntity p : pessoas){
//                emailService.enviarCadastroReserva(p,"email-templateDois.ftl");
//            }
//        }
//    }

}
