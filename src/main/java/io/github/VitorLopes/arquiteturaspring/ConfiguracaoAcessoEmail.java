package io.github.VitorLopes.arquiteturaspring;

import io.github.VitorLopes.arquiteturaspring.todos.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoAcessoEmail {

    @Autowired
    private AppProperties appProperties;


    public MailSender mailSender(){
        return null;
    }

}
