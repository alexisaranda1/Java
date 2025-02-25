package archivos;

import java.io.*;

public class VerificarArchivo {
    public static void main(String[] args) {
        File archivo = new File("archivo.txt");

        if (archivo.exists()) {
            System.out.println("El archivo existe.");
            if (archivo.isFile()) {
                System.out.println("Es un archivo.");
            } else if (archivo.isDirectory()) {
                System.out.println("Es un directorio.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}

