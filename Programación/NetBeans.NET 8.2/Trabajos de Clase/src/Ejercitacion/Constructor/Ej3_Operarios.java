//CREAR UN PROGRAMA PARA USAR CONSTRUCTORES. SE DESEA GUARDAR LOS SUELDOS DE 5 OPERARIOS EN UN VECTOR
//REALIZAR LA CREACIÓN Y CARGA DEL VECTOR EN EL CONSTRUCTOR
package Ejercitacion.Constructor;

import java.util.Scanner;

public class Ej3_Operarios {

    private Scanner teclado;
    private int[] sueldos;

    /*COMO LA CLASE SE LLAMA EJ3OPERARIOS EL CONSTRUCTOR TIENE EL MISMO NOMBRE,
    NO DISPONEMOS LA PALABRA CLAVE VOID YA QUE EL CONSTRUCTOR NO PUEDE RETORNAR DATOS.
     */
    public Ej3_Operarios() {
        teclado = new Scanner(System.in);
        sueldos = new int[5];
        for (int f = 0; f < 5; f++) {
            System.out.println("Ingrese el sueldo: ");
            sueldos[f] = teclado.nextInt();
        }
    }

    //COMO LA CLASE SE LLAMA OPERARIOS EL CONSTRUCTOR TIENE EL MISMO NOMBRE, NO DISPONEMOS LA PALABRA
    //CLAVE VOID YA QUE EL CONSTRCUTOR NO PUEDE RETORNAR DATOS.
    //LA VENTAJA DE PLANTEAR UN CONSTRUCTOR EN LUGAR DE DEFINIR UN MÉTODO CON CUALQUIER NOMBRE ES QUE
    //SE LLAMARÁ EN FORMA AUTOMÁTICA CUANDO SE CREA UN OBJETO DE ESTA CLASE.
    public void imprimir() {
        for (int f = 0; f < 5; f++) {
            System.out.println(sueldos[f]);
        }
    }

    public static void main(String[] args) {
        //CUANDO SE CREA EL OBJETO OBJOPERARIOS SE LLAMA AL MÉTODO CONSTRUCTOR
        Ej3_Operarios objOperarios = new Ej3_Operarios();
        //FINALMENTE LLAMAMOS AL MÉTODO IMPRIMIR
        objOperarios.imprimir();
    }
}
