package archivos;

import java.io.*;

public class LeerArchivo {
    public static void main(String[] args) {
        try {
            // Crear un FileInputStream para abrir el archivo
            FileInputStream fileInputStream = new FileInputStream("archivo.txt");

            // Crear un InputStreamReader para convertir bytes a caracteres
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

            // Usar BufferedReader para leer línea por línea
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String linea;
            // Leer el archivo línea por línea
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            // Cerrar los streams
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
