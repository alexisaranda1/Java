package Principal;


public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Alexis",22,"M");
        System.out.println(persona.getNombre()); 
        System.out.println("Es mayor de edad: "+ persona.mayoredad(persona));
        Persona personaDos = new Persona("Nina",8,"s");
        System.out.println(personaDos.getNombre()); 
        System.out.println("Es mayor de edad: "+ personaDos.mayoredad(personaDos));
    }

}