package ar.edu.undec.plantas.persistencia;

import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.repositorio.IConsultarPlantasRepositorio;
import ar.edu.undec.plantas.persistencia.crud.IConsultarPlantaCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class ConsultarPlantaRepositoryImplementation implements IConsultarPlantasRepositorio {
    @Autowired
    IConsultarPlantaCRUD consultarPlantaCRUD;
    @Override
    public Collection<Planta> obtenerPlantas() {

        Collection<Planta> plantas = new ArrayList<>();
        consultarPlantaCRUD.findAll().forEach(plantaEntity ->
                plantas.add(Planta.instancia(plantaEntity.getNombrecientifico(),plantaEntity.getNombrevulgar(),plantaEntity.getCategoria(),plantaEntity.getEpocaplantado(),plantaEntity.getAlturamaxima()))
                );
        return plantas;

    }
}
