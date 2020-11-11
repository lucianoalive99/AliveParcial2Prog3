package ar.edu.undec.plantas.core.repositorio;

import ar.edu.undec.plantas.core.dominio.Planta;

public interface ICrearPlantaRepositorio  {

    boolean existePlanta(String nomcienti);
    boolean guardarPlanta(Planta laPlanta);
}
