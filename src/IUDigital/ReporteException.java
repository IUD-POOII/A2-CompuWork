package IUDigital;

// @author Santiago Gomez

// Excepción personalizada para errores de generación de reportes
public class ReporteException extends Exception {
    public ReporteException(String message) {
        super(message);
    }
}