package ar.edu.undec.plantas.core.repositorio;

import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.exception.PlantaExisteException;

public interface ICrearPlantaRepositorio  {

    boolean existePlanta(String nomcienti) throws PlantaExisteException;
    boolean guardarPlanta(Planta laPlanta) throws PlantaExisteException;
}
