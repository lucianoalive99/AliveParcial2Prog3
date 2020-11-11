package ar.edu.undec.plantas.usecaseUnitTest;

import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.exception.PlantaExisteException;
import ar.edu.undec.plantas.core.repositorio.ICrearPlantaRepositorio;
import ar.edu.undec.plantas.core.usecase.CrearPlantaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CrearPlantaUseCaseUnitTest {

    @Mock
    ICrearPlantaRepositorio crearPlantaRepositorio;

    @Test
    public void crearPlanta_PlantaNoExiste_CreaPlanta() throws PlantaExisteException {
        Planta laPlanta=Planta.instancia("Erythrina crista-galli","Ceibo","Faboideae","Primavera",10);
        when(crearPlantaRepositorio.existePlanta("Erythrina crista-galli")).thenReturn(false);
        when(crearPlantaRepositorio.guardarPlanta(laPlanta)).thenReturn(true);
        CrearPlantaUseCase crearPlantaUseCase=new CrearPlantaUseCase(crearPlantaRepositorio);
        boolean resultado=crearPlantaUseCase.crearPlanta(laPlanta);
        Assertions.assertTrue(resultado);
    }

    @Test
    public void crearPlanta_PlantaExiste_PlantaExisteException() throws PlantaExisteException {
        //Completar Test
        Planta laPlanta=Planta.instancia("Erythrina crista-galli","Ceibo","Faboideae","Primavera",10);
        when(crearPlantaRepositorio.existePlanta("Erythrina crista-galli")).thenReturn(true);
        when(crearPlantaRepositorio.guardarPlanta(laPlanta)).thenReturn(true);
        CrearPlantaUseCase crearPlantaUseCase=new CrearPlantaUseCase(crearPlantaRepositorio);
        Throwable excepcion;
        excepcion = assertThrows(PlantaExisteException.class,
                () -> when(crearPlantaRepositorio.guardarPlanta(laPlanta)).thenReturn(true));

        assertEquals("La panata que intenta crear ya existe",excepcion.getMessage());


    }


}
