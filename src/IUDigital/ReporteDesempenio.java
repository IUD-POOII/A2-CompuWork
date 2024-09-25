package IUDigital;


import java.util.Date;

public class ReporteDesempenio {
    private Empleado empleado;
    private int puntuacion;
    private String comentario;
    private Date fechaEvaluacion;

    public ReporteDesempenio() {
    }
    public ReporteDesempenio(Empleado empleado, int puntuacion, String comentario, Date fechaEvaluacion) {
        this.empleado = empleado;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(Date fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }
}