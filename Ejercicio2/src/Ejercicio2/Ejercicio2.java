package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try (// Crear un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in)) {
            // Pedir al usuario que ingrese su nombre
            System.out.println("Hola Ingrese su nombre");
            // Leer el nombre del usuario y almacenarlo en una variable
            String nombre = leer.nextLine();
            // Mostrar el nombre del usuario en pantalla
            System.out.println("Hola, " + nombre + "!");
        }

    }

}
