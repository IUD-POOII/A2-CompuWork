package IUDigital;

public abstract class Empleado {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String direccion;
    protected String departamento;
    protected String estado;
    protected String cargo;
    protected double salario;

    public Empleado(int id, String nombre, String apellido, String telefono, String direccion, String departamento, String estado, String cargo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.departamento = departamento;
        this.estado = estado;
        this.cargo = cargo;
        this.salario = salario;
    }

    public abstract void crear();
    public abstract void actualizar();
    public abstract void eliminar();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
