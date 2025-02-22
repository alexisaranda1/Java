package herencia;

public class Gato extends Animal{
    //sobre escritura de metodos 

    /*
     En este código se esta utilizando polimorfismo de sobrecarga (overriding), 
     ya que la clase Gato está modificando el comportamiento de los métodos 
     emitirSonido() y comer() que están definidos en la clase Animal.
     */
   
    @Override
    public void comer(){
        System.out.println("EL gato come");
    }

    
}
