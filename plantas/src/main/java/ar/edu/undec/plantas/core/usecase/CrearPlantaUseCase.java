package ar.edu.undec.plantas.core.usecase;

import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.exception.CategoriaNuloException;
import ar.edu.undec.plantas.core.exception.NombreCientificoNuloException;
import ar.edu.undec.plantas.core.exception.NombreVulgarNuloException;
import ar.edu.undec.plantas.core.exception.PlantaExisteException;
import ar.edu.undec.plantas.core.repositorio.ICrearPlantaRepositorio;
import ar.edu.undec.plantas.core.usecase.input.ICrearPlantaInpunt;

public class CrearPlantaUseCase implements ICrearPlantaInpunt {


    private final ICrearPlantaRepositorio crearPlataRepositorio;

    public CrearPlantaUseCase(ICrearPlantaRepositorio crearPlantaRepositorio) {
        this.crearPlataRepositorio=crearPlantaRepositorio;
    }

    public boolean crearPlanta(Planta laPlanta) throws PlantaExisteException, NombreCientificoNuloException, NombreVulgarNuloException, CategoriaNuloException {

        if (crearPlataRepositorio.existePlanta(laPlanta.getNombrecientifico())) {
            throw new PlantaExisteException();
        } else {
            if (laPlanta.getNombrecientifico() == null) {
                throw new NombreCientificoNuloException();
            } else {
                if (laPlanta.getNombrevulgar() == null) {
                    throw new NombreVulgarNuloException();
                } else {
                    if (laPlanta.getCategoria() == null) throw new CategoriaNuloException();
                    else {
                        return crearPlataRepositorio.guardarPlanta(laPlanta);
                    }
                }

            }

        }
    }

}
