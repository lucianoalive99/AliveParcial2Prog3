package ar.edu.undec.computadoras.core.usecase.input;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.exception.ComputadoraExisteException;

public interface ICrearComputadoInput {
    boolean crearComputadora(Computadora laComputadora) throws ComputadoraExisteException;
}
