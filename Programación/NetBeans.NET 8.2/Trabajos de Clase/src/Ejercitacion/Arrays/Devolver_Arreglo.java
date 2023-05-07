
package Ejercitacion.Arrays;

import java.util.Arrays;

public class Devolver_Arreglo {
    public static void main(String[] args) {
        int Vector1[]={1,4,7};
        int Vector2[]={2,3,8};
        int Resultado [] = Devolverarreglo(Vector1,Vector2);
        
        for(int i=0;i<=Resultado.length-1;i++) {
            System.out.println(Resultado[i]);
        }}
    
   
    public static int [] Devolverarreglo(int [] VectorUno,int [] VectorDos) {
        int[] VectorDevuelto = new int[VectorUno.length + VectorDos.length];
        
        System.arraycopy(VectorUno, 0, VectorDevuelto,0,VectorUno.length);
        System.arraycopy(VectorDos, 0,VectorDevuelto,VectorUno.length, VectorDos.length);
        Arrays.sort(VectorDevuelto);
        return VectorDevuelto;
    }
}
