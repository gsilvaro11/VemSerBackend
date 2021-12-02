package com.dbc.pessoaapi.scheduler;

import com.dbc.pessoaapi.entity.PessoaEntity;
import com.dbc.pessoaapi.kafka.EnviaKafka;
import com.dbc.pessoaapi.repository.PessoaRepository;
import freemarker.template.TemplateException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class MeuNovoSchedulerCron {
    private final EnviaKafka emailService;
    private final PessoaRepository pessoaRepository;

    @Scheduled(cron = "0 32-34 20,21 * * *")
    public void meuPrimeiroScheduler() throws InterruptedException, MessagingException, TemplateException, IOException {
        List<PessoaEntity> pessoas = pessoaRepository.pessoaSemEndereco();
        if(!pessoas.isEmpty()){
            for(PessoaEntity pessoa : pessoas){
                emailService.enviaKafka(pessoa,"email-template.ftl");
            }
        }
    }


}
