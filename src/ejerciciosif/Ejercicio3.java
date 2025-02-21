package ejerciciosif;

import java.util.Scanner;
/*
 Instrucciones:
Pedí al usuario que ingrese una nota entre 0 y 10.
Validá que la nota esté en el rango correcto (0 a 10).
Según la nota, mostrá la calificación:
0-4: Desaprobado
5-6: Aprobado
7-8: Notable
9-10: Sobresaliente
Si la nota ingresada está fuera del rango, mostrá un mensaje de error.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notaIngresado;
        System.out.println("Ingrese una nota entre 0 y 10");
        notaIngresado = scanner.nextInt();
        if (notaIngresado >= 0 && notaIngresado <= 10) {

            if (notaIngresado >= 0 && notaIngresado <= 4) {
             System.out.println("Desaprobado con: "+ notaIngresado);  
            }else if (notaIngresado >= 5 && notaIngresado <= 6) {
                System.out.println("Aprobado con: "+ notaIngresado);  
            }else if (notaIngresado >= 7 && notaIngresado <= 8) {
            System.out.println("Notable: "+ notaIngresado);  
            }else if (notaIngresado >= 9 && notaIngresado <= 10) {
                System.out.println("Sobresaliente: "+ notaIngresado);  
            }
            
        }else{
            System.out.println("Error: Numero no valido");
        }
    }
    
}
