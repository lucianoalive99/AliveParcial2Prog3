package ar.edu.undec.plantas.core.usecase;

import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.repositorio.IConsultarPlantasRepositorio;
import ar.edu.undec.plantas.core.usecase.input.IConsultarPlantaInput;

import java.util.Collection;

public class ConsultarPlantasUseCase implements IConsultarPlantaInput {

    private final IConsultarPlantasRepositorio consultarPlantaRepositorio;

    public ConsultarPlantasUseCase(IConsultarPlantasRepositorio consultarPlantasRepositorio) {
        this.consultarPlantaRepositorio = consultarPlantasRepositorio;
    }

    public Collection<Planta> consultarPlantas() {
        return this.consultarPlantaRepositorio.obtenerPlantas();
    }
}
