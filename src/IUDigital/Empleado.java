package IUDigital;

import java.util.Date;

public class Empleado {
    private int ID;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;
    private String TipoDeEmpleado;
    private Date FechaContratacion;
    private String Departamento;
    private float Salario;
    public Empleado() {}

    public Empleado(int ID, String nombre, String apellido, String direccion, String telefono, String tipoDeEmpleado, Date fechaContratacion, String departamento, float salario) {
        this.ID = ID;
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        Telefono = telefono;
        TipoDeEmpleado = tipoDeEmpleado;
        FechaContratacion = fechaContratacion;
        Departamento = departamento;
        Salario = salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getTipoDeEmpleado() {
        return TipoDeEmpleado;
    }

    public void setTipoDeEmpleado(String tipoDeEmpleado) {
        TipoDeEmpleado = tipoDeEmpleado;
    }

    public Date getFechaContratacion() {
        return FechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        FechaContratacion = fechaContratacion;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }
}
