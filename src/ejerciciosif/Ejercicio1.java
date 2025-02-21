package ejerciciosif;

// Importamos la clase Scanner para leer datos desde la consola
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner que permitirá leer datos desde el teclado (entrada estándar)
        Scanner scanner = new Scanner(System.in);

        // 🔢 Leer un número entero ingresado por el usuario
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt(); // nextInt() lee un número entero

        // 🔍 Verificar si el número ingresado es positivo, negativo o cero usando if-else
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // 🔢 Leer un número decimal ingresado por el usuario
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble(); // nextDouble() lee un número decimal
        System.out.println("Número decimal ingresado: " + numeroDecimal);

        // 📜 Leer una sola palabra
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next(); // next() lee una sola palabra (hasta el primer espacio)
        System.out.println("Palabra ingresada: " + palabra);

        // 📖 Leer una frase completa (línea entera)
        System.out.print("Ingrese una frase completa: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente después del next()
        String frase = scanner.nextLine(); // nextLine() lee la línea completa
        System.out.println("Frase ingresada: " + frase);

        // 🔒 Cerramos el objeto Scanner para liberar recursos
        scanner.close();
    }
}
