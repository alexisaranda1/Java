package archivos;

import java.io.File;
import java.io.IOException;

public class ClaseFile {
    public static void main(String[] args) {
        File archivo = new  File("prueba.txt");

        try {
            archivo.createNewFile();
            
        } catch (IOException e) {
           
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("Nombre del archivo: " + archivo.getName());


    }
    
}
