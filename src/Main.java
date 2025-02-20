import objetos.Persona;


public class Main {
    // variales
 
    String cadana = "Hola";
    boolean flag = true;
    boolean flagDos = false;
    double numeroDecimla = 11.22;
    short varialeShort = 12;
    
    public static void main(String[] args) {
        Persona persona = new Persona("Alexis",22,"M");
        System.out.println(persona.getNombre()); 
    }
}