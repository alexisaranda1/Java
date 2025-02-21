package objetos;
import java.util.Scanner;

public class PracticaBasica {
    public static void main(String[] args) {
        // ✅ TIPOS DE DATOS
        int numeroEntero = 10;
        double numeroDecimal = 5.5;
        char letra = 'A';
        boolean esVerdadero = true;
        String texto = "¡Bienvenido a Java!";
        var mensaje = "Usando var con inferencia de tipos"; // Desde Java 10

        // ✅ OPERADORES
        int suma = numeroEntero + 5;
        int resta = numeroEntero - 3;
        int multiplicacion = numeroEntero * 2;
        double division = numeroDecimal / 2;
        boolean comparacion = numeroEntero > 5;

        // ✅ MOSTRAR RESULTADOS
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("¿El número es mayor que 5?: " + comparacion);

        // ✅ IF-ELSE
        if (esVerdadero) {
            System.out.println("La condición es verdadera.");
        } else {
            System.out.println("La condición es falsa.");
        }

        // ✅ WHILE
        int contador = 0;
        System.out.println("Contando con WHILE:");
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // ✅ FOR
        System.out.println("Contando con FOR:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // ✅ SWITCH
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 3: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Elegiste la opción 1.");
                break;
            case 2:
                System.out.println("Elegiste la opción 2.");
                break;
            case 3:
                System.out.println("Elegiste la opción 3.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}
