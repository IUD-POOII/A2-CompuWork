package IUDigital;

// @author Santiago

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsignarEmpleadoVentana extends JFrame {
    private JComboBox<String> cbEmpleados, cbDepartamentos;

    public AsignarEmpleadoVentana() {
        setTitle("Asignar Empleado a Departamento");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        // Crear componentes (deberías llenar los JComboBox con datos reales)
        cbEmpleados = new JComboBox<>(new String[]{"Empleado 1", "Empleado 2"}); // Cambiar por la lista real
        cbDepartamentos = new JComboBox<>(new String[]{"Departamento 1", "Departamento 2"}); // Cambiar por la lista real
        JButton btnAsignar = new JButton("Asignar");
        btnAsignar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                asignarEmpleado();
            }
        });

        // Añadir componentes a la ventana
        add(new JLabel("Seleccionar Empleado:"));
        add(cbEmpleados);
        add(new JLabel("Seleccionar Departamento:"));
        add(cbDepartamentos);
        add(btnAsignar);

        setVisible(true);
    }

    private void asignarEmpleado() {
        String empleado = (String) cbEmpleados.getSelectedItem();
        String departamento = (String) cbDepartamentos.getSelectedItem();
        // Aquí deberías agregar la lógica para asignar el empleado al departamento

        // Cerrar la ventana después de asignar
        dispose();
    }
}