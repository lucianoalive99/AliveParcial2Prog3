package ar.edu.undec.computadoras.core.usecase;

import ar.edu.undec.computadoras.core.repositorio.IComputadoraRepositorio;

public class CrearComputadoraUseCase {

    private IComputadoraRepositorio computadoraRepositorio;

    public CrearComputadoraUseCase(IComputadoraRepositorio computadoraRepositorio) {
        this.computadoraRepositorio=computadoraRepositorio;
    }
}
