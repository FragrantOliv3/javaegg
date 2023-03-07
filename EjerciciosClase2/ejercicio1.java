package EjerciciosClase2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Ingrese el primer Numero");
            int num1 = input.nextInt();

            System.out.println("Ingrese el segundo numero");
            int num2 = input.nextInt();

            int suma = num1 + num2;

            System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
        }

    }

}
