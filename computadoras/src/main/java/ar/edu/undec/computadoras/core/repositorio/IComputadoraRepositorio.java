package ar.edu.undec.computadoras.core.repositorio;

import ar.edu.undec.computadoras.core.dominio.Computadora;

public interface IComputadoraRepositorio {
    boolean existeComputadora(String codigo);

    boolean guardarComputadora(Computadora laComputadora);
}
