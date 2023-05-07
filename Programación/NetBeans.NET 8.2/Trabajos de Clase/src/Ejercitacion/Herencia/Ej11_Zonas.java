
package Ejercitacion.Herencia;

public class Ej11_Zonas extends Ej11_Empleado{
    private String zona="zona A";

    //CONSTRUCTOR
    public Ej11_Zonas(String Nombre, String Apellido, int Edad, int AñosAntiguedad, int sueldo) {
        super(Nombre, Apellido, Edad, AñosAntiguedad, sueldo);
    }
    //SET Y GET

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getAñosAntiguedad() {
        return AñosAntiguedad;
    }

    public void setAñosAntiguedad(int AñosAntiguedad) {
        this.AñosAntiguedad = AñosAntiguedad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public void IncrementarSueldo(){
        if (this.Edad>50 && zona.equals("zona A")) {
            System.out.println(this.sueldo*25);
        }
    
    }

    @Override
    public String toString() {
        return "Zonas{" + "zona=" + zona + '}';
    }
    public void VerDatosZonas(){
       //System.out.println(IncrementarSueldo());
    }
    
}
