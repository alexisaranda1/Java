package hilos;

public class SegundoHilo implements Runnable {
    
    Thread thread1, thread2, thread3;

    public void inicio(){
        thread1 = new Thread(this, "Hilo 1");
        thread2 = new Thread(this, "Hilo 2");
        thread3 = new Thread(this, "Hilo 3");


        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public  void run(){
        String nombreThread;
        nombreThread = Thread.currentThread().getName();
        if (nombreThread.equals("Hilo 1")){
            System.out.println(" SHilo 1 ");
        } else if (nombreThread.equals("Hilo 2")){
            System.out.println(" S Hilo 2 ");
        }else if (nombreThread.equals("Hilo 3")){
        System.out.println(" S Hilo 3 ");
        }
    }

}
