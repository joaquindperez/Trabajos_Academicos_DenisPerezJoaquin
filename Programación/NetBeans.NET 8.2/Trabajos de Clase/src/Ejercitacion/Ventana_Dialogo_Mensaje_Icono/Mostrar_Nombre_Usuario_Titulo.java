/*Confeccionar un programa que permita ingresar el nombre de usuario y
cuando se presione un botón mostrar lo ingresado en la barra de títulos
del JFrame.*/
package Ejercitacion.Ventana_Dialogo_Mensaje_Icono;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Mostrar_Nombre_Usuario_Titulo {

    public static void main(String[] args) {
        JFrame formulario = new JFrame();
        formulario.setLayout(new FlowLayout());

        JLabel label = new JLabel("Usuario: ");

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(75, 25));

        JButton button = new JButton("Aceptar");
        button.addActionListener((ActionEvent e) -> {
            formulario.setTitle(textField.getText());
            textField.setText("");
        });
        formulario.add(label);
        formulario.add(textField);
        formulario.add(button);
        formulario.pack();
        formulario.setVisible(true);
    }
}
