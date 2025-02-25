package genericos;
public class Genericos {

    // Método genérico que acepta dos parámetros de tipo T y devuelve el primero
    public static <T> T obtenerPrimero(T t1, T t2) {
        return t1;
    }

    public static void main(String[] args) {
        // Usando el método genérico con Integer
        Integer resultado1 = obtenerPrimero(10, 20);
        System.out.println("Primer valor (Integer): " + resultado1);

        // Usando el método genérico con String
        String resultado2 = obtenerPrimero("Java", "Genericos");
        System.out.println("Primer valor (String): " + resultado2);
    }
}

