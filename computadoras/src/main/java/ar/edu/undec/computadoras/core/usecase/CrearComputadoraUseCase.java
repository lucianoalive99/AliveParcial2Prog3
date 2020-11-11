package ar.edu.undec.computadoras.core.usecase;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.exception.ComputadoraExisteException;
import ar.edu.undec.computadoras.core.repositorio.IComputadoraRepositorio;
import ar.edu.undec.computadoras.core.usecase.input.ICrearComputadoInput;
import net.bytebuddy.implementation.bytecode.Throw;

public class CrearComputadoraUseCase implements ICrearComputadoInput {

    private final IComputadoraRepositorio computadoraRepositorio;

    public CrearComputadoraUseCase(IComputadoraRepositorio computadoraRepositorio) {
        this.computadoraRepositorio=computadoraRepositorio;
    }

    public boolean crearComputadora(Computadora laComputadora) throws ComputadoraExisteException {
        if(computadoraRepositorio.existeComputadora(laComputadora.getcodigo())){
            throw new ComputadoraExisteException();
        }else {
            return computadoraRepositorio.guardarComputadora(laComputadora);
        }
    }
}
