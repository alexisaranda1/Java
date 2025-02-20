# Introducción a Java

## ¿Qué es Java?
Java es un lenguaje de programación de alto nivel, orientado a objetos y multiplataforma. Fue desarrollado por Sun Microsystems (ahora propiedad de Oracle) y lanzado en 1995. Su principal ventaja es la portabilidad, gracias a la Máquina Virtual de Java (JVM), que permite ejecutar aplicaciones Java en cualquier sistema operativo sin modificaciones en el código fuente.

## Características Principales
- **Multiplataforma:** Escribelo una vez, ejecútelo en cualquier lugar (WORA - Write Once, Run Anywhere).
- **Orientado a objetos:** Usa clases y objetos para estructurar programas.
- **Seguro:** Manejo automático de memoria y fuerte tipado.
- **Multithreading:** Soporta la ejecución concurrente de hilos de forma nativa.
- **Rendimiento optimizado:** Usa compilación JIT (Just-In-Time) para mejorar la velocidad de ejecución.
- **Amplia comunidad y ecosistema:** Miles de librerías y frameworks disponibles.

## Instalación
### Requisitos previos
Para programar en Java, necesitas instalar el **JDK (Java Development Kit)**.

1. Descarga el JDK desde [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) o [AdoptOpenJDK](https://adoptopenjdk.net/).
2. Instala el JDK según las instrucciones de tu sistema operativo.
3. Configura la variable de entorno `JAVA_HOME` y agrega el `bin` del JDK al `PATH`.
4. Verifica la instalación ejecutando:
   ```sh
   java -version
   javac -version
   ```

## Tu Primer Programa en Java
Crea un archivo llamado `HolaMundo.java` y escribe lo siguiente:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }
}
```

### Compilar y ejecutar
Para compilar el programa, usa:
```sh
javac HolaMundo.java
```

Esto generará un archivo `HolaMundo.class`. Para ejecutarlo:
```sh
java HolaMundo
```

## Conceptos Básicos

### Variables y Tipos de Datos
```java
int numero = 10;
double decimal = 3.14;
char letra = 'A';
boolean esJavaGenial = true;
String texto = "Hola, Java!";
```

### Estructuras de Control
#### Condicionales
```java
if (numero > 5) {
    System.out.println("El número es mayor que 5");
} else {
    System.out.println("El número es menor o igual a 5");
}
```

#### Bucles
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteración " + i);
}
```

### Clases y Objetos
```java
class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        persona.saludar();
    }
}
```

## Recursos Adicionales
- [Documentación oficial de Java](https://docs.oracle.com/en/java/)
- [Curso de Java en W3Schools](https://www.w3schools.com/java/)



