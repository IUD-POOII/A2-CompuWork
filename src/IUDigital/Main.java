package IUDigital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public Main() {
        // Configuración de la ventana principal
        setTitle("Sistema de Gestión de Empleados");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal con botones para cada funcionalidad
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // Botón para agregar empleados
        JButton btnAgregarEmpleado = new JButton("Agregar Empleado");
        btnAgregarEmpleado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AgregarEmpleadoVentana(); // Abre la ventana para agregar empleados
            }
        });

        // Botón para crear departamento
        JButton btnCrearDepartamento = new JButton("Crear Departamento");
        btnCrearDepartamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CrearDepartamentoVentana(); // Abre la ventana para crear departamentos
            }
        });

        // Botón para asignar empleados a departamentos
        JButton btnAsignarEmpleado = new JButton("Asignar Empleado a Departamento");
        btnAsignarEmpleado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AsignarEmpleadoVentana(); // Abre la ventana para asignar empleados
            }
        });

        // Agregar botones al panel
        panel.add(btnAgregarEmpleado);
        panel.add(btnCrearDepartamento);
        panel.add(btnAsignarEmpleado);

        // Agregar el panel a la ventana principal
        add(panel);
    }

    public static void main(String[] args) {
        // Lanzar la aplicación
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}