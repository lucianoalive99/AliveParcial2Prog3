package ar.edu.undec.plantas.controllerUnitTest;

//import ar.edu.undec.plantas.controller.dto.PlantaDTO;
import ar.edu.undec.plantas.controller.dtomodel.PlantaDTO;
import ar.edu.undec.plantas.controller.endpoint.CrearPlantaController;
import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.exception.CategoriaNuloException;
import ar.edu.undec.plantas.core.exception.NombreCientificoNuloException;
import ar.edu.undec.plantas.core.exception.NombreVulgarNuloException;
import ar.edu.undec.plantas.core.exception.PlantaExisteException;
import ar.edu.undec.plantas.core.usecase.input.ICrearPlantaInpunt;
import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@SpringBootTest
public class CrearPlantaControllerUnitTest {

    @Mock
    private ICrearPlantaInpunt crearPlantaInput;

    @Test
        public void crearPlanta_PlantaNoExiste_Devuelve200() throws PlantaExisteException, NombreCientificoNuloException, NombreVulgarNuloException, CategoriaNuloException {
        PlantaDTO laPlantaDTO=new PlantaDTO("Erythrina crista-galli","Ceibo","Faboideae","Primavera",10);
        when(crearPlantaInput.crearPlanta(any(Planta.class))).thenReturn(true);

        CrearPlantaController crearPlantaController = new CrearPlantaController(crearPlantaInput);
        ResponseEntity responseEntity = crearPlantaController.crearPlanta(laPlantaDTO);
        boolean resultado = (boolean) responseEntity.getBody();
        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertTrue(resultado);
    }

    @Test
    public void crearPlanta_PlantaExisteException_Devuelve412() throws PlantaExisteException, NombreCientificoNuloException, NombreVulgarNuloException, CategoriaNuloException {
        //Completar Test
        PlantaDTO laPlantaDTO=new PlantaDTO("Erythrina crista-galli","Ceibo","Faboideae","Primavera",10);
        when(crearPlantaInput.crearPlanta(any(Planta.class))).thenThrow(PlantaExisteException.class);
        CrearPlantaController crearPlantaController = new CrearPlantaController(crearPlantaInput);
        ResponseEntity responseEntity=crearPlantaController.crearPlanta(laPlantaDTO);


        Assertions.assertEquals(HttpStatus.PRECONDITION_FAILED, responseEntity.getStatusCode());
    }

    @Test
    public void crearPlanta_ExcepcionNoPrevista_Devuelve500() throws PlantaExisteException, NombreCientificoNuloException, NombreVulgarNuloException, CategoriaNuloException {
        //Completar Test
        PlantaDTO laPlantaDTO=new PlantaDTO("Erythrina crista-galli","Ceibo","Faboideae","Primavera",10);
        when(crearPlantaInput.crearPlanta(any(Planta.class))).thenThrow(Exception.class);
        CrearPlantaController crearPlantaController = new CrearPlantaController(crearPlantaInput);
        ResponseEntity responseEntity=crearPlantaController.crearPlanta(laPlantaDTO);


        Assertions.assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, responseEntity.getStatusCode());
    }



}
