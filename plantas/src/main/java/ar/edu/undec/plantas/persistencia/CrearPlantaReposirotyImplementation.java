package ar.edu.undec.plantas.persistencia;

import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.exception.PlantaExisteException;
import ar.edu.undec.plantas.core.repositorio.ICrearPlantaRepositorio;
import ar.edu.undec.plantas.persistencia.crud.IConsultarPlantaCRUD;
import ar.edu.undec.plantas.persistencia.crud.ICrearPlantaCRUD;
import ar.edu.undec.plantas.persistencia.entity.PlantaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CrearPlantaReposirotyImplementation implements ICrearPlantaRepositorio {

    @Autowired
    ICrearPlantaCRUD crearPlantaCRUD;

    @Autowired
    IConsultarPlantaCRUD consultarPlantaCRUD;

    @Override
    public boolean existePlanta(String nomcienti) {
                return crearPlantaCRUD.existsByNombrecientifico(nomcienti);
    }

    @Override
    public boolean guardarPlanta(Planta laPlanta) throws PlantaExisteException {
        if(!existePlanta(laPlanta.getNombrecientifico())){
            PlantaEntity plantaEntity = PlantaEntity.plantaToPlantaEntity(laPlanta);
            this.crearPlantaCRUD.save(plantaEntity);
            return plantaEntity.getId()!=null;
        }else {
            return false;
        }

    }
}
