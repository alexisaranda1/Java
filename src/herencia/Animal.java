package herencia;
// Animal es una clase base o superclase en este contexto.
public class Animal {
    private String nombre;
    private int edad;

    public void emitirSonido(){
        System.out.println("El animal hace un sonido generico");
    }
    public void comer(){
        System.out.println("El animal come!");
    }
}
/*
public abstract class Animal {
    private String nombre;
    private int edad;

    // Método abstracto: no tiene implementación, debe ser implementado por las subclases
    public abstract void emitirSonido();

    // Método no abstracto: puede tener implementación, pero las subclases pueden sobrescribirlo
    public void comer() {
        System.out.println("El animal come!");
    }
}
 */