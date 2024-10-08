package IUDigital;

// @author Jaime Espinosa

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarEmpleadoVentana extends JFrame {
    private JTextField txtNombre, txtApellido, txtTelefono, txtDireccion, txtCargo, txtSalario;
    private JComboBox<String> cbTipoEmpleado;

    public AgregarEmpleadoVentana() {
        setTitle("Agregar Empleado");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 2));

        // Crear componentes
        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtTelefono = new JTextField();
        txtDireccion = new JTextField();
        cbTipoEmpleado = new JComboBox<>(new String[]{"Permanente", "Temporal"});
        txtCargo = new JTextField();
        txtSalario = new JTextField();

        JButton btnAgregar = new JButton("Agregar Empleado");
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarEmpleado();
            }
        });

        // Añadir componentes a la ventana
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Apellido:"));
        add(txtApellido);
        add(new JLabel("Teléfono:"));
        add(txtTelefono);
        add(new JLabel("Dirección:"));
        add(txtDireccion);
        add(new JLabel("Tipo de Empleado:"));
        add(cbTipoEmpleado);
        add(new JLabel("Cargo:"));
        add(txtCargo);
        add(new JLabel("Salario:"));
        add(txtSalario);
        add(btnAgregar);

        setVisible(true);
    }

    private void agregarEmpleado() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();
        String tipoEmpleado = (String) cbTipoEmpleado.getSelectedItem();
        String cargo = txtCargo.getText();
        double salario;

        try {
            salario = Double.parseDouble(txtSalario.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Salario debe ser un número válido.");
            return; // Salir si hay un error en la entrada del salario
        }

        // Variables para empleados permanentes
        String beneficios = ""; // Beneficios para empleados permanentes
        int antiguedad = 0; // Antigüedad para empleados permanentes

        try {
            Empleado nuevoEmpleado;
            if (tipoEmpleado.equals("Permanente")) {
                // Solicitar beneficios y antigüedad al usuario
                beneficios = JOptionPane.showInputDialog(this, "Ingrese los beneficios:");
                String antiguedadInput = JOptionPane.showInputDialog(this, "Ingrese la antigüedad:");
                try {
                    antiguedad = Integer.parseInt(antiguedadInput); // Asegúrate de manejar excepciones
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Antigüedad debe ser un número válido.");
                    return; // Salir si hay un error en la entrada de antigüedad
                }

                nuevoEmpleado = new EmpleadoPermanente(0, nombre, apellido, telefono, direccion, "IT", "Activo", cargo, salario, beneficios, antiguedad);
            } else {
                // Solicitar la duración del contrato para empleados temporales
                String contrato = JOptionPane.showInputDialog(this, "Ingrese la duración del contrato (ej: 'Contrato por 3 meses'):");
                String fechaInicio = JOptionPane.showInputDialog(this, "Ingrese la fecha de inicio (ej: '2024-01-01'):");
                String fechaFin = JOptionPane.showInputDialog(this, "Ingrese la fecha de fin (ej: '2024-04-01'):");

                nuevoEmpleado = new EmpleadoTemporal(0, nombre, apellido, telefono, direccion, "IT", "Activo", cargo, salario, contrato, fechaInicio, fechaFin);
            }

            // Obtén el departamento donde quieres agregar el empleado
            // Aquí se asume que tienes una lista de departamentos llamada listaDepartamentos
            // Puedes usar un JComboBox para permitir la selección del departamento
            String[] departamentosDisponibles = {"IT", "HR", "Finance"}; // Ejemplo de departamentos
            String departamentoSeleccionado = (String) JOptionPane.showInputDialog(this, "Seleccione un departamento:", "Seleccionar Departamento", JOptionPane.QUESTION_MESSAGE, null, departamentosDisponibles, departamentosDisponibles[0]);

            if (departamentoSeleccionado != null) {
                // Aquí puedes agregar la lógica para agregar el nuevo empleado al departamento seleccionado
                Departamento departamento = new Departamento(departamentoSeleccionado); // Asegúrate de tener una forma de obtener el departamento real
                departamento.agregarEmpleado(nuevoEmpleado); // Asegúrate de tener este método en la clase Departamento

                JOptionPane.showMessageDialog(this, "Empleado agregado con éxito.");
                dispose(); // Cerrar ventana después de agregar
            } else {
                JOptionPane.showMessageDialog(this, "No se seleccionó un departamento.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en la entrada de datos: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar empleado: " + e.getMessage());
        }
    }

}