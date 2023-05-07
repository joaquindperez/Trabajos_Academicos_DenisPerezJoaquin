/*Estos productos son bebidas*/
package Ejercitacion.Herencia;

/* De los productos nos interesa saber su identificador (cada uno tiene uno distinto),
cantidad de litros, precio y marca.*/
public class Ej7_Bebida {

    //ATRIBUTOS
    private int Id;//Identificador
    private double CantidadLitros;
    private double Precio;
    private String Marca;
    //Calculador de id como autonumerador o contador
    private static int Contador = 1;

    //CONSTRUCTOR
    public Ej7_Bebida(int Id, double CantidadLitros, double Precio, String Marca) {
        this.Id = Contador++;
        this.CantidadLitros = CantidadLitros;
        this.Precio = Precio;
        this.Marca = Marca;
    }

    //SET Y GET 
    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public double getCantidadLitros() {
        return CantidadLitros;
    }

    public void setCantidadLitros(double CantidadLitros) {
        this.CantidadLitros = CantidadLitros;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public static int getContador() {
        return Contador;
    }

    public static void setContador(int Contador) {
        Ej7_Bebida.Contador = Contador;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Id= " + Id + " , Cantidad de Litros= " + CantidadLitros + " , Precio= " + Precio
                + ", Marca= " + Marca;
    }

}
