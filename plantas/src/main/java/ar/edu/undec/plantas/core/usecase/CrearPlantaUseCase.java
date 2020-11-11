package ar.edu.undec.plantas.core.usecase;

import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.exception.PlantaExisteException;
import ar.edu.undec.plantas.core.repositorio.IConsultarPlantaRepositorio;
import ar.edu.undec.plantas.core.repositorio.ICrearPlantaRepositorio;
import ar.edu.undec.plantas.core.usecase.input.ICrearPlantaInpunt;

public class CrearPlantaUseCase implements ICrearPlantaInpunt {


    private final ICrearPlantaRepositorio crearPlataRepositorio;
    //private final IConsultarPlantaRepositorio consultaPlantaRepositori;

    public CrearPlantaUseCase(ICrearPlantaRepositorio crearPlantaRepositorio) {
        this.crearPlataRepositorio=crearPlantaRepositorio;
    }

    public boolean crearPlanta(Planta laPlanta) throws PlantaExisteException {
       if(crearPlataRepositorio.existePlanta(laPlanta.getNombrecientifico())){
            throw new PlantaExisteException();
       }else{
           return crearPlataRepositorio.guardarPlanta(laPlanta);
       }

    }
}
