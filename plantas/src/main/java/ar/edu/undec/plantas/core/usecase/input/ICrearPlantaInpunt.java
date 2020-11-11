package ar.edu.undec.plantas.core.usecase.input;

import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.exception.NombreCientificoException;
import ar.edu.undec.plantas.core.exception.PlantaExisteException;

public interface ICrearPlantaInpunt {
    boolean crearPlanta(Planta planta) throws PlantaExisteException, NombreCientificoException;
}
