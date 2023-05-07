package Ejercitacion.Herencia;

public class Ej7_Main {

    public static void main(String[] args) {
        Ej7_Almacen objAlmacen = new Ej7_Almacen();
        Ej7_Bebida MatrizBebida; //traer matriz

        MatrizBebida = new Ej7_Agua_Mineral("Argentina", 1, 1.5, 60, "Villa Vicencio");
        objAlmacen.AgregarBebida(MatrizBebida);

        MatrizBebida = new Ej7_Bebida_Azucarada(0.2, true, 2, 2.5, 90, "Coca Cola");
        objAlmacen.AgregarBebida(MatrizBebida);

        MatrizBebida = new Ej7_Bebida_Azucarada(0.5, true, 3, 2.0, 50, "Fanta");
        objAlmacen.AgregarBebida(MatrizBebida);

        MatrizBebida = new Ej7_Agua_Mineral("Brasil", 4, 1.0, 20, "ECO");
        objAlmacen.AgregarBebida(MatrizBebida);

        objAlmacen.MostrarBebidas();

        //Mostrar el Precio de todas las bebidas
        System.out.println("Precio de todas las bebidas:  " + objAlmacen.CalcularPrecioTotalBebidas());

        objAlmacen.EliminarBebida(2);
        objAlmacen.MostrarBebidas();
    }

}
