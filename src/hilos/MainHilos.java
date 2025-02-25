package hilos;

public class MainHilos {
    public static void main(String[] args) {
        PrimerHilo primerHilo , primerHilo2,primerHilo3,primerHilo4,primerHilo5;
        primerHilo  = new  PrimerHilo("1");
        primerHilo2 = new  PrimerHilo("2");
        primerHilo3 = new  PrimerHilo("3");
        primerHilo4 = new  PrimerHilo("4");
        primerHilo5 = new  PrimerHilo("5");

        primerHilo.start();
        primerHilo2.start();
        primerHilo3.start();
        primerHilo4.start();
        primerHilo5.start();

        System.out.println("ahora con Runnable");
        SegundoHilo hilo = new SegundoHilo();
        hilo.inicio();

    }
    
}
