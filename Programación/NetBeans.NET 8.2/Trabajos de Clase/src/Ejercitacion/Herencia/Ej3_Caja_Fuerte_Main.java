//Crear una clase que se llame Caja_Fuerte() y otra que se llame Usuario(), que irán dentro del paquete dinero
//Clase Caja_Fuerte
//Crear 4 objetos de la clase usuario(nombres)
//Declarar el método constructor, el método actualizar y Dinero_Total
//Mostrar por consola el nombre de los 4 usuarios, el saldo de dinero que tienen en sus cuentas y el total de dinero entre ellos.

package Ejercitacion.Herencia;

public class Ej3_Caja_Fuerte_Main {
        private Ej3_Usuario cliente1, cliente2, cliente3, cliente4;
    
   public Ej3_Caja_Fuerte_Main() {
       cliente1=new Ej3_Usuario("Juan");
       cliente2=new Ej3_Usuario("Ana");
       cliente3=new Ej3_Usuario("Pedro");
       cliente4=new Ej3_Usuario("Lola");
   }
   public void actualizar() {
       cliente1.depositar(100);
       cliente2.depositar(150);
       cliente3.depositar(200);
       cliente3.extraer(150);
       cliente4.depositar(1000);
       cliente4.extraer(500);
   }
   public void dineroTotal() {
       int t = cliente1.retornarMonto()+cliente2.retornarMonto()+cliente3.retornarMonto()+cliente4.retornarMonto();
       System.out.println("EL TOTAL DEL DINERO RECAUDADO ES: "+t);
       cliente1.imprimir();
       cliente2.imprimir();
       cliente3.imprimir();
       cliente4.imprimir();
   }
   public static void main(String[]ar) {
       Ej3_Caja_Fuerte_Main banco1=new Ej3_Caja_Fuerte_Main();
       banco1.actualizar();
       banco1.dineroTotal();
   }
}
