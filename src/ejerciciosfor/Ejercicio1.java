package ejerciciosfor;

import java.util.Scanner;
/*
 Instrucciones:
Pedí al usuario que ingrese la cantidad de estudiantes.
Usá un bucle for para pedir una nota por cada estudiante.
Validá que cada nota esté entre 0 y 10. Si no está en el rango, volvé a pedir la nota.
Al final, mostrá:
El promedio de las notas.
La cantidad de aprobados (nota mayor o igual a 5).
La cantidad de desaprobados (nota menor a 5).
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Ingrese La cantidad de estudiantes: ");
        int cantidadEstudiante = scanner.nextInt();
        double promedio;
        int cantidadAprobados= 0;
        int cantidadDesaprobados = 0;
        int notaAcumulada = 0;

        for (int i = 1; i <= cantidadEstudiante ; i++) {
            System.out.println("Ingrese la nota del estudiante " + i +":" );
            int notaIngresado = scanner.nextInt();

            if (notaIngresado >= 0 && notaIngresado <= 10) {
                if (notaIngresado >= 5){
                    cantidadAprobados ++;
                }else if (notaIngresado < 5){
                    cantidadDesaprobados ++;
                }

                notaAcumulada += notaIngresado;
            
            }else{
                System.err.println("Error: Nota no es valida: "+ notaIngresado);
                i--;
            }
        }

        promedio = notaAcumulada / cantidadEstudiante;
        System.out.println("Promedio de notas: " + promedio);
        System.out.println("Cantidad de aprobados: " + cantidadAprobados);
        System.out.println("Cantidad de desaprobados: " + cantidadDesaprobados);
        
        scanner.close();


    }
}
