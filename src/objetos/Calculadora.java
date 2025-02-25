

public class Calculadora {
    
    public static void mostrarMenu() {
        System.out.println("📋 Menú de operaciones:\n"
        + "1. Sumar dos números\n"
        + "2. Restar dos números\n"
        + "3. Multiplicar dos números\n"
        + "4. Dividir dos números\n"
        + "5. Salir del programa");
    }

    public static int Sumar(int numeroUno, int numeroDos){
        int suma = numeroUno + numeroDos;
        return suma;
    }
    public static int Restar(int numeroUno, int numeroDos){
        int resta = numeroUno - numeroDos;
        return resta;
    }
    public static int Multiplicar(int numeroUno, int numeroDos){
        int multiplicacion = numeroUno * numeroDos;
        return  multiplicacion;
    }
    public static int Dividir(int numeroUno, int numeroDos){
        int division = numeroUno / numeroDos;
        return  division;
    }

    
}
