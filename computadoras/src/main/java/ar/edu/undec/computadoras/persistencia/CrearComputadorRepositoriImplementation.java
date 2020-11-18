package ar.edu.undec.computadoras.persistencia;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.repositorio.IComputadoraRepositorio;
import ar.edu.undec.computadoras.persistencia.crud.IComsultarComputadoraCRUD;
import ar.edu.undec.computadoras.persistencia.crud.ICrearComputadoraCRUD;
import ar.edu.undec.computadoras.persistencia.entity.ComputadoraEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrearComputadorRepositoriImplementation implements IComputadoraRepositorio {

    @Autowired
    ICrearComputadoraCRUD crearComputadoraCRUD;
    @Autowired
    IComsultarComputadoraCRUD comsultarComputadoraCRUD;


    @Override
    public boolean existeComputadora(String codigo) {

        Iterable<ComputadoraEntity> computadoraEntityList = comsultarComputadoraCRUD.findAll();
        Computadora laComputadora =new Computadora();

            for (ComputadoraEntity laComputadoraEntity : computadoraEntityList) {
                if(laComputadoraEntity.getCodigo().equals(codigo)){
                    laComputadora = ComputadoraEntity.ComputadoraEntityToComputadora(laComputadoraEntity);
                }
            }
        return laComputadora.getcodigo() != null;

    }

    @Override
    public boolean guardarComputadora(Computadora laComputadora) {
        if(!existeComputadora(laComputadora.getcodigo())){
            ComputadoraEntity computadoraEntity = ComputadoraEntity.ComputadoraToComputadoraEntity(laComputadora);
            this.crearComputadoraCRUD.save(computadoraEntity);
            return computadoraEntity.getId()!=null;

        }else{ return false; }
    }
}
