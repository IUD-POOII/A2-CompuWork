package IUDigital;

// @author Jaime Espinosa

import java.util.Date;

public class ReporteDesempenio {
    private Empleado empleado;
    private double puntuacion;
    private Date fecha;
    private String comentario;

    public ReporteDesempenio(Empleado empleado, double puntuacion, Date fecha, String comentario) {
        this.empleado = empleado;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.comentario = comentario;
    }

    public void generarReporte() throws ReporteException {
        if (empleado == null) {
            throw new ReporteException("No se puede generar un reporte para un empleado nulo.");
        }
        System.out.println("Reporte de desempeño para: " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Puntuación: " + puntuacion);
        System.out.println("Fecha: " + fecha);
        System.out.println("Comentario: " + comentario);
    }
}