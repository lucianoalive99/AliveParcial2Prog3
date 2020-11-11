package ar.edu.undec.plantas.core.exception;

public class NombreCientificoException extends Throwable {
    public String getMessage(){
        return "el nombre cientifico no puede estar vacio";
    }
}
