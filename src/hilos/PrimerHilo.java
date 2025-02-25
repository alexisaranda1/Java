package hilos;

public class PrimerHilo extends  Thread{

    int sleepTime;

    public PrimerHilo(String id){
        super(id);
        sleepTime = (int) (Math.random() * 3000);
        System.out.println("Nombre del Hilo: "+ getName()+" Timepo de dormir: "+ sleepTime);

    }
    public void run(){

        try {
            sleep(sleepTime);

        } catch (InterruptedException interruptedException ) {
           System.out.println("interruptedException.toString()= " + interruptedException.toString());
        }

        System.out.println("Hilo: "+ getName());
    }

    
}
