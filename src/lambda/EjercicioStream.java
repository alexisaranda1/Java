/*
 Ejercicio 1: Filtrar y transformar una lista de números
Objetivo: Filtra los números pares de una lista y luego multiplícalos por 2.

Tarea:

Crea una lista de números del 1 al 10.
Filtra los números que son pares.
Multiplica cada número par por 2.
Devuelve la lista con los números multiplicados.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class EjercicioStream{

    public static void main(String[] args) {
  ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        numeros.stream()
        .filter(numero -> numero % 2 == 0)
        .forEach(System.out::println);  
 


    }
    
}