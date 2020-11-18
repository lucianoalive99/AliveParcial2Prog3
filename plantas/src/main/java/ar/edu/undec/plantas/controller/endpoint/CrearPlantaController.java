package ar.edu.undec.plantas.controller.endpoint;

import ar.edu.undec.plantas.controller.dtomodel.PlantaDTO;
import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.exception.*;
import ar.edu.undec.plantas.core.usecase.input.ICrearPlantaInpunt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/vivero")
public class CrearPlantaController {

    @Autowired
    ICrearPlantaInpunt creaPlantaInput;

    public CrearPlantaController(ICrearPlantaInpunt crearPlantaInput) {
        this.creaPlantaInput=crearPlantaInput;
    }

    @PostMapping("/plantas")
    public ResponseEntity<?> crearPlanta(@RequestBody PlantaDTO laPlantaDTO) {
        Planta planta= Planta.PlantaDTOtoPlanta(laPlantaDTO);
        try {
            return ResponseEntity.status(HttpStatus.OK).body(creaPlantaInput.crearPlanta(planta));
        } catch (PlantaExisteException existePlanta) {
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(existePlanta.getMessage());
        }catch (NombreCientificoNuloException nombreCientificoNulo) {
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(nombreCientificoNulo.getMessage());
        }catch (NombreVulgarNuloException nombreVulgarNulo) {
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(nombreVulgarNulo.getMessage());
        }catch (CategoriaNuloException categoriaNulo) {
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(categoriaNulo.getMessage());
        }
        catch (Exception otraEx) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(otraEx.getMessage());
        }

    }
}
