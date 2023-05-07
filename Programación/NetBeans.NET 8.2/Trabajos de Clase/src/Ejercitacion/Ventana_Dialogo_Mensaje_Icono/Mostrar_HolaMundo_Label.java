package Ejercitacion.Ventana_Dialogo_Mensaje_Icono;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mostrar_HolaMundo_Label extends JFrame{
     private JLabel label1;
public Mostrar_HolaMundo_Label() {
setLayout(null);
label1=new JLabel("Hola Mundo.");
label1.setBounds(10,20,200,30);
add(label1);
}
public static void main(String[] ar) {
Mostrar_HolaMundo_Label oEj2=new Mostrar_HolaMundo_Label();
oEj2.setBounds(10,10,400,300);
oEj2.setVisible(true);
}
}
