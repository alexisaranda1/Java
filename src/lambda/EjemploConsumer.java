
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class EjemploConsumer {
    public static void main(String[] args) {
        
        Consumer<String> consumer = mensaje -> System.out.println("Menssaje = "+ mensaje);

        consumer.accept("Usando lambda");

        BiConsumer<String, String> biConsumer = (nombre, apellido) -> System.out.println("Nombre: "+ nombre+ ", Apellido: "+ apellido);
        biConsumer.accept("Alexis", "Aranda");

        
        System.out.println("Simplificado");
        
        Consumer<String> consumer1 = System.out::println;

        consumer1.accept("Usando lambda");

        BiConsumer<String, String> biConsumer1 = (nombre, apellido) -> System.out.println("Nombre: "+ nombre+ ", Apellido: "+ apellido);
        biConsumer1.accept("Alexis", "Aranda");

        
        
        
        Supplier<String> proveedor = () -> { return "Devuelve un Resultado "; };
        System.err.println("Aca llamo a proveedor: " + proveedor.get());

        
        Function<String, String> fun =input -> "Bievenido "+ input + "!"; 
         
        String resultado = fun.apply("Alex");
        System.out.println(resultado);


        BiFunction<String, String, String> biFun = (nombre, apellido) -> "Bievenido "+ nombre + " " + apellido; 

        
        System.out.println(biFun.apply("Juan", "Pérez"));

        
        Predicate<Integer> predicate = numero -> numero < 20;
        boolean test = predicate.test(20);

        System.out.println("test: "+test);
        BiPredicate <String,String> predicate2 = (nombre1, nombre2) -> nombre1.equals(nombre2);
        boolean test1 = predicate2.test("alexis", "alexis");

        System.out.println("son iguales los nombres? : "+test1);


        
        
    }
    
    //se ahorrra esto
    public static  String mensajeString(String mensajeString){
        return "hola"; 

    }


}
