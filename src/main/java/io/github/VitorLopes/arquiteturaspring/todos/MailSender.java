package io.github.VitorLopes.arquiteturaspring.todos;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviar(String mensagem){
        System.out.println("Enviar email: " + mensagem);
    }
}
