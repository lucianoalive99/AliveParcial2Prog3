package ar.edu.undec.computadoras.controller.endpoint;

import ar.edu.undec.computadoras.controller.dtomodel.ComputadoraDTO;
import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.exception.ComputadoraExisteException;
import ar.edu.undec.computadoras.core.usecase.input.ICrearComputadoInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/electronica")
public class CrearComputadoraController {
    @Autowired
    ICrearComputadoInput crearComputadoInput;

    @PostMapping(value = "/computadoras")
    public ResponseEntity<?>CrearMascota(@RequestBody ComputadoraDTO laComputadorDTO) throws ComputadoraExisteException {
        Computadora computadora = Computadora.computadoraDTOtoMascota(laComputadorDTO);
        try {
            Boolean resultado = crearComputadoInput.crearComputadora(computadora);
            return ResponseEntity.status(HttpStatus.OK).body("Computador creada exitosamente.");
        }catch (ComputadoraExisteException existeLaComputadora){
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(existeLaComputadora.getMessage());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en el servidor");
        }

    }
}
