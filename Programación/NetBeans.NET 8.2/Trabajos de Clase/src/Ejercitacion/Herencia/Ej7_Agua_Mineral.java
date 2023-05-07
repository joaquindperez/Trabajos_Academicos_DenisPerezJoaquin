//Estos productos son bebidas como agua mineral 
package Ejercitacion.Herencia;

public class Ej7_Agua_Mineral extends Ej7_Bebida {

    private String Manantial = "Argentina";/*Si es agua mineral nos
interesa saber también el origen (manantial tal sitio o donde sea).*/

    //CONSTRUCTOR
    public Ej7_Agua_Mineral(String Manantial, int Id, double CantidadLitros, double Precio, String Marca) {
        super(Id, CantidadLitros, Precio, Marca);//llamar a la clase padre
        this.Manantial = Manantial;
    }

    //SET Y GET
    public String getManantial() {
        return Manantial;
    }

    public void setManantial(String Manantial) {
        this.Manantial = Manantial;
    }

    //TO STRING
    @Override
    public String toString() {
        return super.toString() + " Manantial= " + Manantial;
    }

}
