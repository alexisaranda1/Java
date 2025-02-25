// Definimos una interfaz llamada Animal
interface Animal {
    void hacerSonido(); // Método sin implementación (lo deben definir las clases)
}

// Clase Perro que implementa la interfaz Animal
class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}

// Clase Gato que implementa la interfaz Animal
class Gato implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla: ¡Miau miau!");
    }
}

// Clase principal para probar la interfaz
public class EjemploInterface {
    public static void main(String[] args) {
        Animal miPerro = new Perro(); // Crear un objeto de Perro
        Animal miGato = new Gato();   // Crear un objeto de Gato

        miPerro.hacerSonido(); // Llama al método implementado en Perro
        miGato.hacerSonido();  // Llama al método implementado en Gato
    }
}
