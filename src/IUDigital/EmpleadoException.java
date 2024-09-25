package IUDigital;

// @author Santiago Gomez

// Excepción personalizada para errores de gestión de empleados
public class EmpleadoException extends Exception {
    public EmpleadoException(String message) {
        super(message);
    }
}