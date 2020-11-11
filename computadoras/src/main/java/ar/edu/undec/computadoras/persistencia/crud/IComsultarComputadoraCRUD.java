package ar.edu.undec.computadoras.persistencia.crud;

import ar.edu.undec.computadoras.persistencia.entity.ComputadoraEntity;
import org.springframework.data.repository.CrudRepository;

public interface IComsultarComputadoraCRUD extends CrudRepository<ComputadoraEntity,Integer> {
}
