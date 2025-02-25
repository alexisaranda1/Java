import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EjemploLambda{

    public static void main(String[] args) {
        
        // Función Consumer
        ejemploConsumer();
        
        // Función BiConsumer
        ejemploBiConsumer();
        
        // Función Supplier
        ejemploSupplier();
        
        // Función Function
        ejemploFunction();
        
        // Función BiFunction
        ejemploBiFunction();
        
        // Función Predicate
        ejemploPredicate();
        
        // Función BiPredicate
        ejemploBiPredicate();
    }

    /**
     * Ejemplo de uso de Consumer.
     * Consumer acepta un solo parámetro y no devuelve nada.
     * En este caso, imprime el mensaje pasado como parámetro.
     */
    public static void ejemploConsumer() {
        Consumer<String> consumer = mensaje -> System.out.println("Mensaje = " + mensaje);
        consumer.accept("Usando lambda");

        // Abreviación usando referencia de método
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("Usando referencia de método");
    }

    /**
     * Ejemplo de uso de BiConsumer.
     * BiConsumer acepta dos parámetros y no devuelve nada.
     * En este caso, imprime el nombre y apellido.
     */
    public static void ejemploBiConsumer() {
        BiConsumer<String, String> biConsumer = (nombre, apellido) -> 
            System.out.println("Nombre: " + nombre + ", Apellido: " + apellido);
        biConsumer.accept("Alexis", "Aranda");

        // Abreviación usando lambda de forma más compacta
        BiConsumer<String, String> biConsumer1 = (nombre, apellido) -> 
            System.out.println("Nombre: " + nombre + ", Apellido: " + apellido);
        biConsumer1.accept("Alexis", "Aranda");
    }

    /**
     * Ejemplo de uso de Supplier.
     * Supplier no toma parámetros, pero devuelve un valor.
     * En este caso, devuelve un string.
     */
    public static void ejemploSupplier() {
        Supplier<String> proveedor = () -> "Devuelve un Resultado";
        System.err.println("Aca llamo a proveedor: " + proveedor.get());
    }

    /**
     * Ejemplo de uso de Function.
     * Function toma un parámetro y devuelve un valor.
     * En este caso, se utiliza para dar un saludo con el nombre.
     */
    public static void ejemploFunction() {
        Function<String, String> fun = input -> "Bienvenido " + input + "!";
        String resultado = fun.apply("Alex");
        System.out.println(resultado);
    }

    /**
     * Ejemplo de uso de BiFunction.
     * BiFunction toma dos parámetros y devuelve un valor.
     * En este caso, construye un saludo con el nombre y apellido.
     */
    public static void ejemploBiFunction() {
        BiFunction<String, String, String> biFun = (nombre, apellido) -> 
            "Bienvenido " + nombre + " " + apellido;
        System.out.println(biFun.apply("Juan", "Pérez"));
    }

    /**
     * Ejemplo de uso de Predicate.
     * Predicate toma un parámetro y devuelve un booleano.
     * En este caso, verifica si el número es menor que 20.
     */
    public static void ejemploPredicate() {
        Predicate<Integer> predicate = numero -> numero < 20;
        boolean test = predicate.test(20);
        System.out.println("test: " + test);
    }

    /**
     * Ejemplo de uso de BiPredicate.
     * BiPredicate toma dos parámetros y devuelve un booleano.
     * En este caso, compara si dos nombres son iguales.
     */
    public static void ejemploBiPredicate() {
        BiPredicate<String, String> predicate2 = (nombre1, nombre2) -> 
            nombre1.equals(nombre2);
        boolean test1 = predicate2.test("alexis", "alexis");
        System.out.println("¿Son iguales los nombres? : " + test1);
    }

    // Función extra que no se está usando en el código principal
    // Este método muestra un ejemplo de cómo puedes escribir una función tradicional.
    public static String mensajeString(String mensajeString) {
        return "hola";
    }
}
