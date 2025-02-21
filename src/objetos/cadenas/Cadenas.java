package objetos.cadenas;

public class Cadenas {

    public static void main(String[] args) {
        String miString = "algo va aca";
        String miString2 = "Algo va aca";

        // Largo de la cadena
        System.out.println("Largo: " + miString.length());

        // Caracter en posición 9
        System.out.println("La letra en la posición 9: " + miString.charAt(9));

        // Comparar dos cadenas
        System.out.println("Comparar exactamente: " + miString.equals(miString2));
        System.out.println("Comparar ignorando mayúsculas/minúsculas: " + miString.equalsIgnoreCase(miString2));

        // Comprobar inicio y fin de la cadena
        System.out.println("Empieza con 'algo': " + miString.startsWith("algo"));
        System.out.println("Termina con 'aca': " + miString.endsWith("aca"));

        // indexOf
        System.out.println("Índice de 'va': " + miString.indexOf("va"));

        // substring
        System.out.println("Substring desde el índice 5: " + miString.substring(5));
        System.out.println("Substring del 0 al 4: " + miString.substring(0, 4));

        // concat
        System.out.println("Concatenar otra cadena: " + miString.concat(" y algo más"));

        // replace
        System.out.println("Reemplazar 'aca' por 'aquí': " + miString.replace("aca", "aquí"));

        // toUpperCase y toLowerCase
        System.out.println("En mayúsculas: " + miString.toUpperCase());
        System.out.println("En minúsculas: " + miString.toLowerCase());

        // trim
        String cadenaConEspacios = "  Hola Mundo  ";
        System.out.println("Trim: '" + cadenaConEspacios.trim() + "'");

        // toString
        System.out.println("toString: " + miString.toString());

        // toCharArray
        char[] caracteres = miString.toCharArray();
        System.out.print("Caracteres: ");
        for (char c : caracteres) {
            System.out.print(c + " ");
        }
        System.out.println();

        // valueOf
        int numero = 123;
        String numeroComoTexto = String.valueOf(numero);
        System.out.println("Número convertido a String: " + numeroComoTexto);

        // split
        String[] palabras = miString.split(" ");
        System.out.println("Separar palabras:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // StringBuffer (modificable y thread-safe)
        StringBuffer buffer = new StringBuffer("Hola");
        buffer.append(" Mundo");
        System.out.println("StringBuffer: " + buffer.toString());

        // StringBuilder (modificable y más rápido que StringBuffer)
        StringBuilder builder = new StringBuilder("Hola");
        builder.append(" Mundo");
        System.out.println("StringBuilder: " + builder.toString());
    }


    
}
