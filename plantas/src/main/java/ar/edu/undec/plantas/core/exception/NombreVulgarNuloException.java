package ar.edu.undec.plantas.core.exception;

public class NombreVulgarNuloException extends Throwable {
    public String getMessage(){
        return "El nombre vulgar no puede estar vacio";
    }
}
