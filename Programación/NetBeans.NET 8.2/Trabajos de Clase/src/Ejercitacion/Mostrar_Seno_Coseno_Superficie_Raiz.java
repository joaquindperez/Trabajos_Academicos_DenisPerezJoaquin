
package Ejercitacion;

import java.util.Scanner;

public class Mostrar_Seno_Coseno_Superficie_Raiz {
    public static void Coseno() {
        Scanner teclado=new Scanner(System.in);
        int i=0, j=1;
        while(i<=100) {
            if (j%2!=0) {
                System.out.println("COSENO DE: "+j+" = "+Math.cos(j));
                i++;
            }
            j++;
        }
    }
    public static void seno() {
        Scanner teclado=new Scanner(System.in);
        int i=0, j=1;
        while(i<=100) {
            if (j%2==0) {
                System.out.println("SENO DE: "+j+" = "+Math.sin(j));
                i++;
            }
            j++;
        }
    }
    public static void superficie() {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio=teclado.nextDouble();
        double superficie=Math.PI * Math.pow(radio,2);
        System.out.println("Superficie: "+superficie);
        
    }
    public static void raizcuadrada() {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double numero=teclado.nextDouble();
        double raiz=Math.sqrt(numero);
        System.out.println("Raiz cuadrada: "+raiz);
    }
    public static void main(String[]args) {
        String continuar=null;
        do{
            System.out.println("1. SENO DE LOS PRIMEROS 100 NÚMEROS PARES.\n"
            +"2. COSENO DE LOS PRIMEROS 100 NÚMEROS IMPARES.\n"
            +"3. SUPERFICIE DE UN CIRCULO.\n"
            +"4. RAIZ CUADRADA DE UN CIRCULO.\n"
            +"INGRESE UNA OPCIÓN...");
            Scanner teclado=new Scanner(System.in);
            int opcion=teclado.nextInt();
           
            if(opcion==1){
                seno();
            }else if(opcion==2){
                        Coseno();
                        }else if(opcion==3){
                            superficie();
                        }else if(opcion==4){
                            raizcuadrada();
                        }

            System.out.println("Desea continuar?(S/N): ");
            Scanner tec=new Scanner(System.in);
            continuar=tec.nextLine();
        }while (continuar.equals("S") || continuar.equals("s"));
            
        }
}
