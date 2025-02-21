package herencia;

public class Gato extends Animal{


    public  void mauiar(){
        System.out.println("El gato Mauia ");
    }
    //sobrecarga
    @Override
    public void comer(){
        System.out.println("EL gato come");
    }

    
}
