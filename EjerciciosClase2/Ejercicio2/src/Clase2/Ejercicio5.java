package Clase2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero
        System.out.print("Por favor, ingrese un número entero: ");

        // Leer el número entero del usuario y almacenarlo en una variable
        int numero = sc.nextInt();

        // Calcular el doble del número
        int doble = 2 * numero;

        // Calcular el triple del número
        int triple = 3 * numero;

        // Calcular la raíz cuadrada del número
        double raizCuadrada = Math.sqrt(numero);

        // Mostrar los resultados en pantalla
        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El triple de " + numero + " es: " + triple);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
}
