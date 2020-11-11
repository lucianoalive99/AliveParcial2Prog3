package ar.edu.undec.plantas.controller.endpoint;

import ar.edu.undec.plantas.controller.dtomodel.PlantaDTO;
import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.exception.NombreCientificoException;
import ar.edu.undec.plantas.core.exception.PlantaExisteException;
import ar.edu.undec.plantas.core.usecase.input.ICrearPlantaInpunt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import sun.net.www.protocol.http.HttpURLConnection;

public class CrearPlantaController {

    @Autowired
    private ICrearPlantaInpunt creaPlantaInput;

    public CrearPlantaController(ICrearPlantaInpunt crearPlantaInput) {
        this.creaPlantaInput=crearPlantaInput;
    }

    public ResponseEntity<?> crearPlanta(PlantaDTO laPlantaDTO) {
        Planta planta= Planta.PlantaDTOtoPlanta(laPlantaDTO);
        try {
            boolean resultado = creaPlantaInput.crearPlanta(planta);
            return ResponseEntity.status(HttpStatus.OK).body(resultado);
        } catch (PlantaExisteException existePlanta) {
            existePlanta.getMessage();
        }catch (NombreCientificoException nombreCientificoNull){
            nombreCientificoNull.getMessage();
        }


    }
}
