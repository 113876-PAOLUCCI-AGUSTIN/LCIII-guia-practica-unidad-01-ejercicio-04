/*
 * LC_III-guía-práctica-unidad-01-ejercicio-04
 * 4. Ingresar nombre y altura de dos personas, informar el nombre de la más alta.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre y altura de dos personas...");

        String nombrePersona01 = teclado.next();
        Double alturaPersona01 = teclado.nextDouble();
        String nombrePersona02 = teclado.next();
        Double alturaPersona02 = teclado.nextDouble();

        if (!alturaPersona01.equals(alturaPersona02)) {
            if (alturaPersona01 > alturaPersona02) {
                System.out.println(nombrePersona01 + " es la persona más alta.");
            }
            else {
                System.out.println(nombrePersona02 + " es la persona más alta.");
            }
        }
        else {
            System.out.println("Estas personas tienen la misma altura. ;)");
        }
    }
}