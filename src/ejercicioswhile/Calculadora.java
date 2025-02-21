package ejercicioswhile;
/*
 Instrucciones:
Mostrá un menú al usuario con las siguientes opciones:

1. Sumar dos números
2. Restar dos números
3. Multiplicar dos números
4. Dividir dos números
5. Salir del programa
El usuario debe ingresar una opción.

Según la opción seleccionada:

Pedí los dos números.
Realizá la operación correspondiente.
Mostrá el resultado.
El programa debe repetirse hasta que el usuario elija la opción de salir (5).

Si el usuario ingresa una opción inválida, mostrá un mensaje de error y volvé a mostrar el menú.

Validá que no se divida por cero.
 */
import java.util.Scanner;

public class Calculadora {
    public static void mostrarMenu() {
        System.out.println("📋 Menú de operaciones:\n"
        + "1. Sumar dos números\n"
        + "2. Restar dos números\n"
        + "3. Multiplicar dos números\n"
        + "4. Dividir dos números\n"
        + "5. Salir del programa");
    }
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int opcion = 0;
        while (opcion != 5){
            mostrarMenu();

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresar Numero Uno: ");
                    int numeroUno = scanner.nextInt();
                    System.out.println("Ingresar Numero Dos: ");
                    int numeroDos = scanner.nextInt();
                    int suma = numeroUno + numeroDos;
                    System.out.println("La suma es: "+ suma);
                    break;
                case 2:
                    System.out.println("Ingresar Numero Uno: ");
                    int numeroUnoR = scanner.nextInt();
                    System.out.println("Ingresar Numero Dos: ");
                    int numeroDosR = scanner.nextInt();
                    int resta = numeroUnoR - numeroDosR;
                    System.out.println("La resta es: "+ resta);
                    break;
                case 3:
                    System.out.println("Ingresar Numero Uno: ");
                    int numeroUnoM = scanner.nextInt();
                    System.out.println("Ingresar Numero Dos: ");
                    int numeroDosM = scanner.nextInt();
                    int mutiplicacion = numeroUnoM * numeroDosM;
                    System.out.println("La multiplicacion es: "+ mutiplicacion);
                    break;
                case 4:
                    System.out.println("Ingresar Numero Uno: ");
                    int numeroUnoD = scanner.nextInt();
                    System.out.println("Ingresar Numero Dos: ");
                    int numeroDosD = scanner.nextInt();
                    int division = numeroUnoD / numeroDosD;
                    System.out.println("La division es: "+ division);
                    break;
                case  5:
                    System.out.println("Salio!");
                    break;
           
                default:
                    System.out.println("Error: opcion incorrecta");
                    mostrarMenu();
                    break;
            }
        }
        scanner.close();

  

    }
    
}
