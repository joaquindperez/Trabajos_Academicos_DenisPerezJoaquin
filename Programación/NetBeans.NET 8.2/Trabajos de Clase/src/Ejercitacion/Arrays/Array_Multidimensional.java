
package Ejercitacion.Arrays;

public class Array_Multidimensional {
    public static void main (String[]args) {
        //ASIGNAR LOS VALORES AL MOMENTO DE CREAR EL ARREGLO
    int[][] Arreglo2 = { {1,2}, {3,4}, {5,6} };
    int[][] Arreglo3 = {{1,2},{3,4},{5,6},{7,8},{9,10},{11,12}};
    int[][] Diagonal = new int[4][4];
    //{1,2} CORRESPONDE A LA FILA 1
//{3,4} CORRESPONDE A LA FILA 2
//{5,6} CORRESPONDE A LA FILA 3
//1,3,5 CORRESPONDEN A LA COLUMNA 1
//2,4,6 CORRESPONDEN A LA COLUMNA 2

//OBTENER LA CANTIDAD DE FILAS Y COLUMNAS DEL ARREGLO
   /*for (int i = 0; i < Arreglo2.length; i++) {
       for(int j = 0; j < Arreglo2[i].length; j++) {
           System.out.print(Arreglo2[i][j]+"\t"); // \t realiza un espacio
        }
        System.out.println(""); //REALIZA UN ENTER
    }*/
   for(int i=0; i<Diagonal.length; i++){
       for(int j=0; j<Diagonal[i].length;j++) {
           if (i == j) {
               Diagonal[i][j]=1;
           }else {
               Diagonal[i][j]=0;
           }
       } 
   }
   MostrarVector(Arreglo2); //Mostrar metodo 
   System.out.println("---------");
   MostrarVector(Arreglo3);
   System.out.println("-------------------------");
   MostrarVector(Diagonal);
    }
    public static void MostrarVector(int[][]matriz) { //METODO QUE MUESTRA EL MISMO ARREGLO
         for (int i = 0; i < matriz.length; i++) {
       for(int j = 0; j < matriz[i].length; j++) {
           System.out.print(matriz[i][j]+"\t"); // \t realiza un espacio
        }
        System.out.println(""); //REALIZA UN ENTER
        
        }
    }
}
