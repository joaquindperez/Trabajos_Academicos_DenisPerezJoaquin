
package Ejercitacion;

public class Prueba_Secuencia_Escape {
    /* \n: nueva línea
\t: tabulación
\r: retrocede el carro
\f: comienzo de página
\b: borrado a la izquierda
\\: caracter barra inversa
\': caracter prima simple
\": caracter prima doble o biprima */
    public static void main(String[]arg) {
        //RECORDAR QUE
       // \N NUEVA LINEA
      // \T TABULACION
      String Cadena = "Buenos dias !!!\n\nComo estas?\n\tTareas para Hoy:\n\"Estudiar\"\t\'Gimnasia\'\tDescanso";
      System.out.println(Cadena);
    }
}
