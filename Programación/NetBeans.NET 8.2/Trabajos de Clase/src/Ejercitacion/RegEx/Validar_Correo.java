package Ejercitacion.RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar_Correo {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String email;
        System.out.println("Introduce el email: ");
        email = sc.nextLine();
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); //compilar el patron
        Matcher mat = pat.matcher(email);//ver si hay coicidencia
        if (mat.find()) {
            System.out.println("Correo Válido");
        } else {
            System.out.println("Correo No Válido");
        }
    }
}
