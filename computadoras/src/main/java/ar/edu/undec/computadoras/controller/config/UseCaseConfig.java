package ar.edu.undec.computadoras.controller.config;

import ar.edu.undec.computadoras.core.usecase.CrearComputadoraUseCase;
import ar.edu.undec.computadoras.persistencia.CrearComputadorRepositoriImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Autowired
    CrearComputadorRepositoriImplementation crearComputadorRepositoriImplementation;
    @Bean
    public CrearComputadoraUseCase crearComputadoraUseCase(){
        return new CrearComputadoraUseCase(crearComputadorRepositoriImplementation);
    }
}
