package io.github.VitorLopes.arquiteturaspring.montadora.configuration;

import io.github.VitorLopes.arquiteturaspring.montadora.Motor;
import io.github.VitorLopes.arquiteturaspring.montadora.TipoMotor;
import io.github.VitorLopes.arquiteturaspring.montadora.api.Eletrico;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    @Scope("singleton")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(160);
        motor.setCilindros(4);
        motor.setLitragem(1.8);
        motor.setModelo("L15B7");
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }


    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(200);
        motor.setCilindros(8);
        motor.setLitragem(2.8);
        motor.setModelo("2025");
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(350);
        motor.setCilindros(12);
        motor.setLitragem(3.1);
        motor.setModelo("B2025");
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

}
