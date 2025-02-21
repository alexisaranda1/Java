package ejerciciosif;

import java.util.Scanner;

/*
 * 🎯 Ejercicio: Categoría de salario
Objetivo: Practicar condicionales con múltiples rangos.

📜 Instrucciones:
Pedí al usuario que ingrese su salario mensual.

Mostrá un mensaje que indique en qué categoría se encuentra según su salario:

Menor a 50,000: "Salario bajo"
Entre 50,000 y 100,000 (inclusive): "Salario medio"
Mayor a 100,000: "Salario alto"
Mostrá un mensaje de error si el salario ingresado es negativo.
 */


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioIngresado;
        System.out.println("Ingrese  un salario ");
        salarioIngresado = scanner.nextDouble();

        if(salarioIngresado < 0){
            System.out.println("Error: Salario no puede ser negativo");
        }else if (salarioIngresado < 50000){
            System.out.println("Salario Bajo: " + salarioIngresado);
        }else if (salarioIngresado > 50000 && salarioIngresado <= 100000){
         System.out.println("Salario medio: "+ salarioIngresado);   
        }else if (salarioIngresado > 100000){
            System.out.println("Salario Alto: "+ salarioIngresado);
        }
        scanner.close();

    }
    
}
