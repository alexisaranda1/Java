package herencia;

public class Gato extends Animal{

    @Override
    public  void emitirSonido(){
        System.out.println("El gato Mauia ");
    }

    @Override
    public void comer(){
        System.out.println("EL gato come");
    }

    
}
