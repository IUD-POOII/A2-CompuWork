package IUDigital;

// @author Cristian Pallares

public class EmpleadoTemporal extends Empleado {
    private String contrato;
    private String fechaInicio;
    private String fechaFin;

    public EmpleadoTemporal(int id, String nombre, String apellido, String telefono, String direccion, String departamento, String estado, String cargo, double salario, String contrato, String fechaInicio, String fechaFin) {
        super(id, nombre, apellido, telefono, direccion, departamento, estado, cargo, salario);
        this.contrato = contrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public void crear() {
        // Lógica específica para crear un empleado temporal
        System.out.println("Empleado temporal creado: " + nombre + " " + apellido);
    }

    @Override
    public void actualizar() {
        // Lógica específica para actualizar un empleado temporal
        System.out.println("Empleado temporal actualizado: " + nombre + " " + apellido);
    }

    @Override
    public void eliminar() {
        // Lógica específica para eliminar un empleado temporal
        System.out.println("Empleado temporal eliminado: " + nombre + " " + apellido);
    }

    // Getters y Setters adicionales
    public String getContrato() { return contrato; }
    public String getFechaInicio() { return fechaInicio; }
    public String getFechaFin() { return fechaFin; }

    public void setContrato(String contrato) { this.contrato = contrato; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }
}
