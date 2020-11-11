package ar.edu.undec.computadoras.core.usecase;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.exception.ComputadoraExisteException;
import ar.edu.undec.computadoras.core.repositorio.IComputadoraRepositorio;
import net.bytebuddy.implementation.bytecode.Throw;

public class CrearComputadoraUseCase {

    private final IComputadoraRepositorio computadoraRepositorio;

    public CrearComputadoraUseCase(IComputadoraRepositorio computadoraRepositorio) {
        this.computadoraRepositorio=computadoraRepositorio;
    }

    public boolean crearComputadora(Computadora laComputadora) throws ComputadoraExisteException {
        if(computadoraRepositorio.existeComputadora(laComputadora.getResumen())){
            throw new ComputadoraExisteException();
        }else {
            return computadoraRepositorio.guardarComputadora(laComputadora);
        }
    }
}
