package io.github.VitorLopes.arquiteturaspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class ExemploValue {

    @Value("${app.config.variavel}")
    private String variavel;

    public void imprimirVariavel(){
        System.out.println(variavel);
    }

}
