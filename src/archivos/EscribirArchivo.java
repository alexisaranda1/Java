package archivos;

import java.io.*;

public class EscribirArchivo {
    public static void main(String[] args) {
        try {
            // Crear un FileOutputStream para escribir en el archivo
            FileOutputStream fileOutputStream = new FileOutputStream("archivo_salida.txt");

            // Crear un OutputStreamWriter para convertir caracteres a bytes
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

            // Crear un BufferedWriter para escribir líneas de texto
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            // Escribir texto en el archivo
            bufferedWriter.write("¡Hola, este es un archivo de salida!");
            bufferedWriter.newLine();
            bufferedWriter.write("Segunda línea del archivo.");

            // Cerrar los streams
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
