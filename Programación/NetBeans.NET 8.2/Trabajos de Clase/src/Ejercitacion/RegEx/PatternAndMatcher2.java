package Ejercitacion.RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher2 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce email: ");
        cadena = sc.nextLine();
        Pattern pat = Pattern.compile(".*abc.*");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
