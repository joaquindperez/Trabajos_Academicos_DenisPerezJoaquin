
package Ejercitacion.Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Elementos {
    // Declaración el ArrayList3 
    public static void main(String[] args) {
        
ArrayList<String> nombreArrayList = new ArrayList<String>(); 
// Añadimos 10 Elementos en el ArrayList3 
for (int i=1; i<=10; i++){
 nombreArrayList.add("Elemento "+i);
 }
// Añadimos un nuevo elemento al ArrayList3 en la posición 2 
nombreArrayList.add(2, "Elemento 3");
// Declaramos el Iterador e imprimimos los Elementos del ArrayList3 
Iterator nombreIterator = nombreArrayList.iterator(); 
while(nombreIterator.hasNext()){ 
String elemento = (String) nombreIterator.next(); 
System.out.print(elemento+" / "); 
}
    }
}
