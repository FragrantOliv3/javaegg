package Clase2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner palabra = new Scanner(System.in)) {
            System.out.println("Ingrese una Palabra");

            String Palabramayus = palabra.nextLine();

            System.out.println("La frase escrita en mayúsculas es: " + Palabramayus.toUpperCase());

            System.out.println("La frase escrita en minúscula es: " + Palabramayus.toUpperCase());
        }

    }
}
