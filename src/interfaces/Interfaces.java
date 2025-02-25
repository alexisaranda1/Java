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