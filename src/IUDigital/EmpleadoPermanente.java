
package IUDigital;

public class EmpleadoPermanente extends Empleado {
    private String beneficios;
    private int antiguedad;

    public EmpleadoPermanente(int id, String nombre, String apellido, String telefono, String direccion, String departamento, String estado, String cargo, double salario, String beneficios, int antiguedad) {
        super(id, nombre, apellido, telefono, direccion, departamento, estado, cargo, salario);
        this.beneficios = beneficios;
        this.antiguedad = antiguedad;
    }

    @Override
    public void crear() {
        // Lógica específica para crear un empleado permanente
        System.out.println("Empleado permanente creado: " + nombre + " " + apellido);
    }

    @Override
    public void actualizar() {
        // Lógica específica para actualizar un empleado permanente
        System.out.println("Empleado permanente actualizado: " + nombre + " " + apellido);
    }

    @Override
    public void eliminar() {
        // Lógica específica para eliminar un empleado permanente
        System.out.println("Empleado permanente eliminado: " + nombre + " " + apellido);
    }

    // Getters y Setters adicionales
    public String getBeneficios() { return beneficios; }
    public int getAntiguedad() { return antiguedad; }
}
