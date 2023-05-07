
package Ejercitacion.Herencia;

public class Ej7_Almacen {
     /*En el almacén iremos almacenado las bebidas por estanterías (que son las columnas de la matriz).*/
    private Ej7_Bebida[][] Estanteria; //[FILAS][COLUMNAS]

    //Declarar cantidad de filas y columnas de la matriz "Bebida"
    public Ej7_Almacen() {
        Estanteria = new Ej7_Bebida[6][4];
    }

    /*Calcular precio de todas las bebidas: calcula el precio total de todos los productos del almacén.*/
    public double CalcularPrecioTotalBebidas() {
        double PrecioTotal = 0;
        for (int i = 0; i < Estanteria.length; i++) {//length cuenta la cantidad de filas
            for (int j = 0; j < Estanteria[0].length; j++) {
                if (Estanteria[i][j] != null) { //verifica que no este vacia la estanteria
                    PrecioTotal += Estanteria[i][j].getPrecio();//Suma de los precios
                }
            }
        }
        //Polimorfismo
        return PrecioTotal;
    }

    /*Calcular el precio total de una marca de bebida: dada
    una marca, calcular el precio total de esas bebidas.*/
    public double CalcularPrecioBebidasMarca(String Marca) {
        double PrecioTotal = 0;
        for (int i = 0; i < Estanteria.length; i++) {
            for (int j = 0; j < Estanteria[0].length; j++) {
                //if (Estanteria[i][j] != null) {
                if (Estanteria[i][j].getMarca().equalsIgnoreCase(Marca)) {
                    PrecioTotal += Estanteria[i][j].getPrecio();
                    // }

                }
            }

        }
        //Polimorfismo
        return PrecioTotal;
    }

    /*Calcular el precio total de una estantería: dada una estantería (columna) 
    calcular el precio total de esas bebidas.*/
    public double CalcularPrecioBebidasEstanteria(int Columna) {
        double PrecioTotal = 0;
        if (Columna >= 0 && Columna < Estanteria[0].length) {
            for (int i = 0; i < Estanteria.length; i++) {
                if (Estanteria[i][Columna] != null) {
                    PrecioTotal += Estanteria[i][Columna].getPrecio();
                }
            }

        } else {
            System.out.println("La Columna Debe Estar Entre 0 y " + Estanteria[0].length);
        }
        return PrecioTotal;
    }

    /*Agregar producto: agrega un producto en la primera posición libre, si el identificador esta 
    repetido en alguno de las bebidas, no se agregará esa bebida.*/
    public void AgregarBebida(Ej7_Bebida b) {
        boolean Posicion = false; //Encontrar la primera posición
        for (int i = 0; i < Estanteria.length && !Posicion; i++) {//El ! verifica si se agregó una bebida
            for (int j = 0; j < Estanteria[0].length && !Posicion; j++) {
                if (Estanteria[i][j] == null) {//verifica si hay algún valor
                    Estanteria[i][j] = b;//Se Agrega la bebida
                    Posicion = true;//Salgo
                }
            }
        }
        //Se Verifica si se registró la Bebida
        if (Posicion) {
            System.out.println("La Bebida está Registrada");
        } else {
            System.out.println("No Se Logró Registrar la Bebida");
        }
    }

    /*Eliminar un producto: dado un ID, eliminar el producto del almacén.*/
    public void EliminarBebida(int id) {
        boolean Producto = false;
        for (int i = 0; i < Estanteria.length && !Producto; i++) {
            for (int j = 0; j < Estanteria[0].length && !Producto; j++) {
                if (Estanteria[i][j] != null) {
                    if (Estanteria[i][j].getId() == id) {//Verificar el Id que se está buscando
                        Estanteria[i][j] = null;//Eliminar la Bebida
                        Producto = true;
                    }
                }
            }
        }
        //Verificar si se eliminó correctamente
        if (Producto) {
            System.out.println("La Bebida Fue Eliminada");
        } else {
            System.out.println("No Existe la Bebida");
        }
    }

    /*Mostrar información: mostramos para cada bebida toda su información.*/
    public void MostrarBebidas() {
        for (int i = 0; i < Estanteria.length; i++) {
            for (int j = 0; j < Estanteria[0].length; j++) {
                if (Estanteria[i][j] != null) {
                    System.out.println("Fila: " + i + ", Columna: " + j + ", Bebida: " + Estanteria[i][j].toString());
                    //Mostrar los datos de todas las bebidas a través de tosting
                }
            }
        }
    }

}
