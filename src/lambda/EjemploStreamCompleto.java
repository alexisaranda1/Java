import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EjemploStreamCompleto {

    public static void main(String[] args) {

        // Paso 1: Crear un ArrayList de colores
        List<String> colores = new ArrayList<>();
        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("amarillo");
        colores.add("negro");
        colores.add("morado");

        // Paso 2: Filtrar colores, mapear a mayúsculas, usar peek, etc.

        // Filtrar los colores que contienen la letra 'a', convertir a mayúsculas,
        // y hacer un "peek" para mostrar el estado del stream antes de aplicar cualquier acción.
        colores.stream()
                .filter(color -> color.contains("a"))  // Filtrar los colores que contienen 'a'
                .map(String::toUpperCase)  // Convertir a mayúsculas
                .peek(color -> System.out.println("Estado intermedio (Peek): " + color))  // Ver el estado intermedio
                .forEach(System.out::println);  // Imprimir los colores transformados

        // Paso 3: Verificar si hay algún color que contenga la letra 'e' usando anyMatch
        boolean existeColorConE = colores.stream()
                .anyMatch(color -> color.contains("e"));  // Verificar si hay algún color con 'e'

        System.out.println("¿Existe un color con 'e'? " + existeColorConE);

        // Paso 4: Usar flatMap para aplanar una lista de listas de colores
        List<List<String>> listaDeColores = new ArrayList<>();
        listaDeColores.add(colores);  // Agregar nuestra lista de colores original

        // Aplanar la lista de listas y mostrar los colores que contienen la letra 'o'
        listaDeColores.stream()
                .flatMap(List::stream)  // Aplanar la lista de listas
                .filter(color -> color.contains("o"))  // Filtrar los colores que contienen 'o'
                .forEach(System.out::println);  // Imprimir los colores que cumplen con la condición

        // Paso 5: Usar findAny para obtener un color cualquiera que cumpla con la condición
        Optional<String> colorEncontrado = colores.stream()
                .filter(color -> color.length() > 5)  // Filtrar colores con más de 5 caracteres
                .findAny();  // Obtener un color cualquiera que cumpla con la condición

        colorEncontrado.ifPresent(color -> System.out.println("Color encontrado con más de 5 caracteres: " + color));
    }
}
