package genericos;

// Clase genérica que recibe un parámetro de tipo T
public class Caja<T> {
    // Atributo de tipo genérico
    private T contenido;

    // Constructor
    public Caja(T contenido) {
        this.contenido = contenido;
    }

    // Método para obtener el contenido
    public T obtenerContenido() {
        return contenido;
    }

    // Método para cambiar el contenido
    public void ponerContenido(T contenido) {
        this.contenido = contenido;
    }

    public static void main(String[] args) {
        // Usando la clase Caja con un tipo Integer
        Caja<Integer> cajaInt = new Caja<>(123);
        System.out.println("Contenido de cajaInt: " + cajaInt.obtenerContenido());

        // Usando la clase Caja con un tipo String
        Caja<String> cajaString = new Caja<>("Hola Mundo");
        System.out.println("Contenido de cajaString: " + cajaString.obtenerContenido());
    }
}

