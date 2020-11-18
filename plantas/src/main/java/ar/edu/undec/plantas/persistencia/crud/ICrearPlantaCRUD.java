package ar.edu.undec.plantas.persistencia.crud;

import ar.edu.undec.plantas.persistencia.entity.PlantaEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICrearPlantaCRUD extends CrudRepository<PlantaEntity,Integer> {
    boolean existsByNombrecientifico(String nombreCientifico);
}
