package ar.edu.undec.computadoras.persistenceUnitTest;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.persistencia.CrearComputadorRepositoriImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CrearComputadoraDataTest {

    @Autowired
    CrearComputadorRepositoriImplementation crearComputadorRepositoriImplementation;

    @Test
    public void crearComputadora_ComputadoraNoExiste_CrearCorrectamente(){

        Computadora elComputadora = Computadora.instancia("I310401000GB16GB",
                "Core I3 1040",1000,"SSD",16,"PC");

        boolean resultado = crearComputadorRepositoriImplementation.guardarComputadora(elComputadora);
        Assertions.assertTrue(resultado);
    }

    @Test
    public void crearComputadora_ComputadoraSiExiste_NoCreaMacota(){

        Computadora elComputadora = Computadora.instancia("I310401000GB16GB",
                "Core I3 1040",1000,"SSD",16,"PC");

        boolean resultado = crearComputadorRepositoriImplementation.guardarComputadora(elComputadora);
        Assertions.assertFalse(resultado);
    }
}
