package IUDigital;

// @author Jaime Espinosa

import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEmpleado(Empleado empleado) throws EmpleadoException {
        if (empleado == null) {
            throw new EmpleadoException("No se puede agregar un empleado nulo.");
        }
        empleados.add(empleado);
        empleado.setDepartamento(this.nombre); // Asigna el departamento al empleado
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
        empleado.setDepartamento(null); // Limpia la asignación de departamento en el empleado
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void listarEmpleados() {
        System.out.println("Empleados en el departamento " + nombre + ":");
        for (Empleado emp : empleados) {
            System.out.println(emp.getNombre() + " " + emp.getApellido());
        }
    }
}