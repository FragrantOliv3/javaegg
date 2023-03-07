package Clase2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese la cantidad de grados centígrados
        System.out.print("Por favor, ingrese la cantidad de grados centígrados: ");

        // Leer la cantidad de grados centígrados del usuario y almacenarla en una
        // variable
        double gradosC = sc.nextDouble();

        // Convertir los grados centígrados a grados Fahrenheit utilizando la fórmula F
        // = 32 + (9 * C / 5)
        double gradosF = 32 + (9 * gradosC / 5);

        // Mostrar la equivalencia en grados Fahrenheit
        System.out.println(gradosC + " grados centígrados equivalen a " + gradosF + " grados Fahrenheit.");
    }

}
