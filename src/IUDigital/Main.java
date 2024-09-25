package IUDigital;

// Author Santiago Gomez

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        // Crear una lista para almacenar empleados
        List<Empleado> empleados = new ArrayList<>();
        Departamento departamento = new Departamento("IT");

        // Crear empleados permanentes
        EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente(1, "Juan", "Pérez", "555-1234", "123 Main St", "IT", "Activo", "Desarrollador", 3000, "Seguro médico", 2);

        // Manejo de excepciones al agregar empleado
        try {
            departamento.agregarEmpleado(empleadoPermanente);
            empleadoPermanente.crear(); // Crear el empleado
        } catch (EmpleadoException e) {
            System.out.println("Error al agregar empleado: " + e.getMessage());
        }

        // Crear empleados temporales
        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(2, "Ana", "López", "555-5678", "456 Elm St", "Asistente", "Activo", "Asistente", 1500, "Contrato por 3 meses", "2024-01-01", "2024-04-01");

        try {
            departamento.agregarEmpleado(empleadoTemporal);
            empleadoTemporal.crear(); // Crear el empleado
        } catch (EmpleadoException e) {
            System.out.println("Error al agregar empleado: " + e.getMessage());
        }

        // Generar reportes de desempeño
        try {
            ReporteDesempenio reporte1 = new ReporteDesempenio(empleadoPermanente, 85, new Date(), "Excelente desempeño en proyectos.");
            reporte1.generarReporte();

            ReporteDesempenio reporte2 = new ReporteDesempenio(empleadoTemporal, 75, new Date(), "Cumplió con los objetivos del contrato temporal.");
            reporte2.generarReporte();
        } catch (ReporteException e) {
            System.out.println("Error al generar reporte: " + e.getMessage());
        }

        // Actualizar y eliminar empleados
        empleadoPermanente.actualizar(); // Actualizar información del empleado permanente
        empleadoTemporal.eliminar(); // Eliminar empleado temporal

        // Mostrar lista de empleados después de la eliminación
        System.out.println("\nLista de empleados después de la eliminación:");
        departamento.listarEmpleados();
    }
}
