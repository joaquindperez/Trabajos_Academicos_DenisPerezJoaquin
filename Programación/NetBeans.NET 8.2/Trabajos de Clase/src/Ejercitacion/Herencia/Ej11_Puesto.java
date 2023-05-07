package Ejercitacion.Herencia;

public class Ej11_Puesto extends Ej11_Empleado{
     private String Puesto="Gerente";
    private String Puesto2="Empleado";

    //CONSTRUCTOR
    public Ej11_Puesto(String Nombre, String Apellido, int Edad, int AñosAntiguedad, int sueldo, String Puesto) {
        super(Nombre, Apellido, Edad, AñosAntiguedad, sueldo);
    }

    //SET Y GET
    public String getPuesto2() {
        return Puesto2;
    }

    public void setPuesto2(String Puesto2) {
        this.Puesto2 = Puesto2;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
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
     public void IncrementarSueldo() {
         if (this.Edad<35 && Nombre.equals(Puesto)) {
             System.out.println(this.sueldo*25);
         }
         
     }

    @Override
        public String toString() {
        return "Puesto{" + "Puesto=" + Puesto + ", Puesto2=" + Puesto2 + '}';
    }

    public void VerDatosPuesto() {
     // System.out.println(IncrementarSueldo());
     }
    
}
