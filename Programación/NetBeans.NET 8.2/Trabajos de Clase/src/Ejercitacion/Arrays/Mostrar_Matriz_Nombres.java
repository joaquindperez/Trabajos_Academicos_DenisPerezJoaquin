
package Ejercitacion.Arrays;

public class Mostrar_Matriz_Nombres {
    public static void main(String arg[]) {
        //Primer metodo
        String[] nombre = new String[4];
        nombre[0]="Luis";
        nombre[1] = "María";
        nombre[2] = "Carlos";
        nombre[3] = "Jose"; //Error:No existe esta variable array de indice 4
        
        //Llamar al array con sentencia for
        /*for(int i=0;i<4;i++) {
            System.out.println(nombre[i]);
        }*/
        
        
        //segundo metodo
        String nombre2[] = {"Luis","Maria","Carlos","Jose"};
        
        //Llamar al array con sentencia for a nombre2
        /*
        for(int i=0;i<4;i++) {
            System.out.println(nombre2[i]);
        }*/
          imprimir(nombre);
          imprimir(nombre2);
    }
    
    //Mostrar en un vector
    public static void imprimir(String [] vector) {
        for(int i=0;i<vector.length;i++) {
            System.out.println(vector[i]);
        
        }
    }
}
