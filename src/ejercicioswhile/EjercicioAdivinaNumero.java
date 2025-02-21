package ejercicioswhile;
import java.util.Scanner;

public class EjercicioAdivinaNumero {
    public static void main(String[] args) {
        int numeroSecreto = 5; // Número secreto que el usuario debe adivinar
        Scanner scanner = new Scanner(System.in);
        int cantidadIntentos = 0;
        int numeroIngresado = 0;

        System.out.println("🎲 Bienvenido al juego: Adivina el número secreto");
        System.out.println("El número secreto está entre 1 y 100. ¡Intentá adivinarlo!");

        // Bucle while que se repite hasta que el usuario adivine el número secreto
        while (numeroIngresado != numeroSecreto) {
            System.out.print("Ingrese un número: ");
            numeroIngresado = scanner.nextInt(); // Leer número ingresado por el usuario
            cantidadIntentos++; // Aumentar el número de intentos

            // Validar si el número ingresado está en el rango válido
            if (numeroIngresado < 1 || numeroIngresado > 100) {
                System.out.println("⚠️ Error: El número debe estar entre 1 y 100. Inténtelo nuevamente.");
            } else if (numeroIngresado < numeroSecreto) {
                System.out.println("❌ El número secreto es mayor que " + numeroIngresado + ". Inténtelo nuevamente.");
            } else if (numeroIngresado > numeroSecreto) {
                System.out.println("❌ El número secreto es menor que " + numeroIngresado + ". Inténtelo nuevamente.");
            }
        }

        // Mensaje de éxito cuando el usuario adivina el número
        System.out.println("✅ ¡Felicitaciones! Adivinaste el número secreto.");
        System.out.println("🔢 Te tomó " + cantidadIntentos + " intentos adivinarlo. ¡Buen trabajo!");

        scanner.close(); // Cerrar el scanner
    }
}
