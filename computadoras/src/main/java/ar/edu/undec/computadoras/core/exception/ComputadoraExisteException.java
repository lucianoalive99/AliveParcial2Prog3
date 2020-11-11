package ar.edu.undec.computadoras.core.exception;

public class ComputadoraExisteException extends Exception {
    public ComputadoraExisteException() {
        super();
        System.out.println("La computadora ya existe.");
    }
}
