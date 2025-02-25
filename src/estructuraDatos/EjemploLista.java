import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        // Crear una lista de String
        List<String> nombres = new ArrayList<>();
        
        // Agregar elementos a la lista
        nombres.add("Alexis");
        nombres.add("Nina");
        nombres.add("Pelu");
        nombres.add("Susy");

        // Mostrar los nombres en la lista
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Acceder a un nombre específico (por índice)
        System.out.println("\nPrimer nombre: " + nombres.get(0)); // Muestra "Alexis"

        // Cambiar un elemento en la lista
        nombres.set(2, "Carlos"); // Cambia "Pelu" por "Carlos"
        System.out.println("\nLista después de cambiar 'Pelu' por 'Carlos':");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Eliminar un nombre de la lista
        nombres.remove("Susy"); // Elimina "Susy"
        System.out.println("\nLista después de eliminar 'Susy':");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Verificar si un nombre está en la lista
        if (nombres.contains("Nina")) {
            System.out.println("\nLa lista contiene a Nina.");
        } else {
            System.out.println("\nLa lista NO contiene a Nina.");
        }

        // Tamaño de la lista
        System.out.println("\nTamaño de la lista: " + nombres.size());
    }
}
