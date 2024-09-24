package IUDigital;

import java.util.Date;

public class ReporteDesempenio {
    private int ID;
    private Date Fecha;
    private String MetricasDesempenio;
    private String ReferenciasEmpleado;

    public ReporteDesempenio() {}

    public ReporteDesempenio(int ID, Date fecha, String metricasDesempenio, String referenciasEmpleado) {
        this.ID = ID;
        Fecha = fecha;
        MetricasDesempenio = metricasDesempenio;
        ReferenciasEmpleado = referenciasEmpleado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getMetricasDesempenio() {
        return MetricasDesempenio;
    }

    public void setMetricasDesempenio(String metricasDesempenio) {
        MetricasDesempenio = metricasDesempenio;
    }

    public String getReferenciasEmpleado() {
        return ReferenciasEmpleado;
    }

    public void setReferenciasEmpleado(String referenciasEmpleado) {
        ReferenciasEmpleado = referenciasEmpleado;
    }
}
