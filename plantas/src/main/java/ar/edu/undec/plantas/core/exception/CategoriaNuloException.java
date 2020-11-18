package ar.edu.undec.plantas.core.exception;

public class CategoriaNuloException extends Throwable{
    public String getMessage(){
        return "La categoria no puede estar vacia";
    }
}
