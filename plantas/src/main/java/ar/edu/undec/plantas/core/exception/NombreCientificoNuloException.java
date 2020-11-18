package ar.edu.undec.plantas.core.exception;

public class NombreCientificoNuloException extends Throwable {
    public String getMessage(){
        return "El nombre cientifico no puede estar vacio";
    }
}
