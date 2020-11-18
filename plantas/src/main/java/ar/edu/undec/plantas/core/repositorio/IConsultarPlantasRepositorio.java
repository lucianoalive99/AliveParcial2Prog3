package ar.edu.undec.plantas.core.repositorio;

import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.usecase.input.ICrearPlantaInpunt;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface IConsultarPlantasRepositorio{
    Collection<Planta> obtenerPlantas();

}
