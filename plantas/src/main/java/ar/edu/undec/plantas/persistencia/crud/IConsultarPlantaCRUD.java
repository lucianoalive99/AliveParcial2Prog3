package ar.edu.undec.plantas.persistencia.crud;

import ar.edu.undec.plantas.persistencia.entity.PlantaEntity;
import org.springframework.data.repository.CrudRepository;

public interface IConsultarPlantaCRUD extends CrudRepository<PlantaEntity,Integer> {
}
