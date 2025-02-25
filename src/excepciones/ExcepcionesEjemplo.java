public class ExcepcionesEjemplo {

    public static void main(String[] args) {
        // Ejemplo 1: División por cero
        try {
            int resultado = 10 / 0; // Esto genera ArithmeticException
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }

        // Ejemplo 2: Índice fuera de los límites del array
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Esto genera ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Intentaste acceder a una posición inexistente en el array.");
        }

        // Ejemplo 3: Uso de una referencia nula
        try {
            String texto = null;
            System.out.println(texto.length()); // Esto genera NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Intentaste acceder a un objeto que es nulo.");
        }

        // Ejemplo 4: Uso de múltiples catch para distintos tipos de excepciones
        try {
            int a = 5 / 0; // Provoca ArithmeticException
            String str = null;
            System.out.println(str.length()); // Provoca NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Error matemático detectado.");
        } catch (NullPointerException e) {
            System.out.println("Error: Se intentó acceder a un objeto nulo.");
        } finally {
            System.out.println("Este bloque siempre se ejecuta, haya error o no.");
        }

        System.out.println("El programa sigue funcionando sin problemas.");
    }
}
