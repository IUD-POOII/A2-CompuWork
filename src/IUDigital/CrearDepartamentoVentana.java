package IUDigital;

// @author Santiago Gómez

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearDepartamentoVentana extends JFrame {
    private JTextField txtNombreDepartamento;

    public CrearDepartamentoVentana() {
        setTitle("Crear Departamento");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 2));

        // Crear componentes
        txtNombreDepartamento = new JTextField();
        JButton btnCrear = new JButton("Crear Departamento");
        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearDepartamento();
            }
        });

        // Añadir componentes a la ventana
        add(new JLabel("Nombre del Departamento:"));
        add(txtNombreDepartamento);
        add(btnCrear);

        setVisible(true);
    }

    private void crearDepartamento() {
        String nombre = txtNombreDepartamento.getText();
        // Aquí deberías agregar la lógica para crear un nuevo departamento
        // Por ejemplo:
        Departamento departamento = new Departamento(nombre);
        // Agregar el departamento a la lista de departamentos

        // Cerrar la ventana después de crear
        dispose();
    }
}