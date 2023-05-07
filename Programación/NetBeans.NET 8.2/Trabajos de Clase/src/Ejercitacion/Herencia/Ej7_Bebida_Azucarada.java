/*Estos productos son bebidas azucaradas*/
package Ejercitacion.Herencia;

public class Ej7_Bebida_Azucarada extends Ej7_Bebida{//Heredar de bebida
    /*Si es una bebida azucarada queremos saber el porcentaje que tiene de azúcar y si tiene o no
alguna promoción (si la tiene tendrá un descuento del 10% en el precio).*/
    private double PorcentajeAzucar;
    private boolean Promocion;//Boolean para almacenar valores

    //CONSTRUCTOR
    public Ej7_Bebida_Azucarada(double PorcentajeAzucar, boolean Promocion, int Id, double CantidadLitros, double Precio, String Marca) {
        super(Id, CantidadLitros, Precio, Marca);
        this.PorcentajeAzucar = PorcentajeAzucar;
        this.Promocion = Promocion;
    }

    //SET Y GET
    public double getPorcentajeAzucar() {
        return PorcentajeAzucar;
    }

    public void setPorcentajeAzucar(double PorcentajeAzucar) {
        this.PorcentajeAzucar = PorcentajeAzucar;
    }

    public boolean isPromocion() {
        return Promocion;
    }

    public void setPromocion(boolean Promocion) {
        this.Promocion = Promocion;
    }

    //TO STRING
    @Override
    public String toString() {
        return super.toString() + " Porcentaje de Azucar= " + PorcentajeAzucar + " , Promoción= " + Promocion;
    }

    //Metodo de descuento según la promoción
    public double Descuento() {
        if (this.Promocion) {
            return super.getPrecio() * 0.9; //obtener el precio de la clase padre para el 10% descuento
        } else {
            return super.getPrecio();//obtener solo el precio
        }
    }

}
