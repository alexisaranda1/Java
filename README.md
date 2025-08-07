# 📚 Reto de Java - Documentación de Aprendizaje

Este repositorio contiene ejercicios y ejemplos prácticos de Java para desarrollar y consolidar conocimientos fundamentales del lenguaje. Está organizado de manera progresiva, abarcando desde estructuras básicas hasta conceptos avanzados de Programación Orientada a Objetos (POO).

---

## 🔰 **1. Fundamentos de Java**

### ✅ Estructura básica de un programa en Java
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}
```

### ✅ Tipos de datos primitivos
- `int`: Números enteros
- `double`: Números con decimales
- `char`: Caracteres
- `boolean`: Verdadero o falso
- `String`: Cadena de caracteres (no es primitivo, pero se usa mucho)

### ✅ Operadores básicos
- Aritméticos: `+`, `-`, `*`, `/`, `%`
- Comparación: `==`, `!=`, `<`, `>`, `<=`, `>=`
- Lógicos: `&&`, `||`, `!`

### ✅ Estructuras de control
```java
if (numero > 0) {
    System.out.println("Número positivo");
} else if (numero < 0) {
    System.out.println("Número negativo");
} else {
    System.out.println("Es cero");
}
```

### ✅ Bucles
- **For**
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Número: " + i);
}
```

- **While**
```java
int i = 0;
while (i < 5) {
    System.out.println("Número: " + i);
    i++;
}
```

### ✅ Scanner (Entrada de datos)
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese un número: ");
int numero = scanner.nextInt();
scanner.close();
```

---

## 🏗️ **2. Programación Orientada a Objetos (POO)**

### ✅ Definición de clase y creación de objetos
```java
public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}
```

### ✅ Modificadores de acceso
- `public`: Accesible desde cualquier clase.
- `private`: Accesible solo dentro de la clase.
- `protected`: Accesible dentro del paquete y subclases.
- Sin modificador (default): Accesible solo dentro del mismo paquete.

### ✅ Encapsulamiento y uso de `this`
```java
public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
```

### ✅ Sobrecarga de métodos (Overloading)
```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }
}
```

### ✅ Sobrescritura de métodos (Overriding) con Herencia
```java
class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void emitirSonido() {
        System.out.println("El animal hace un sonido genérico");
    }
}

class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("El gato maúlla");
    }
}
```

### ✅ Polimorfismo
```java
Animal miAnimal = new Perro("Firulais", 5);
miAnimal.emitirSonido(); // Llama al método de la clase Perro
```

### ✅ Clases abstractas
```java
abstract class Figura {
    abstract double calcularArea();
}

class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```

### ✅ Garbage Collector
```java
public class Recolector {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("El objeto está siendo eliminado por el garbage collector");
    }
}
```

---

## 📝 **3. Ejercicios realizados**

1. Verificar si un número es positivo, negativo o cero.
2. Determinar si una persona es mayor de edad.
3. Calcular si un año es bisiesto.
4. Comparar dos números.
5. Juego de adivinanza de número secreto.
6. Menú interactivo de operaciones matemáticas.
7. Implementar herencia con las clases `Animal`, `Perro` y `Gato`.
8. Aplicar polimorfismo al sobrescribir métodos en las subclases.
9. Uso de constructores en clases derivadas.
10. Práctica de encapsulamiento con atributos privados y métodos públicos.

---

## 🌐 **4. Aplicación Web - AutoCatalog**

### ✅ Servidor HTTP y Aplicación Web
Se ha implementado una aplicación web completa para catálogo de automóviles que incluye:

- **Servidor HTTP en Java**: Usando `com.sun.net.httpserver` para servir contenido web
- **Logo personalizado**: Diseño SVG con paleta de colores azules cohesiva
- **Catálogo interactivo**: Filtrado de automóviles por categorías
- **Diseño responsivo**: Compatible con dispositivos móviles

#### Ejecutar la aplicación web:
```bash
# Compilar
javac src/web/AutoCatalogServer.java

# Ejecutar servidor
java -cp src web.AutoCatalogServer

# Abrir en navegador: http://localhost:8080
```

#### Características técnicas:
- ✅ Paleta de colores basada en logo (`#1A365D`, `#2C5282`, `#4299E1`)
- ✅ Arquitectura modular (HTML, CSS, JavaScript)
- ✅ Animaciones CSS y JavaScript
- ✅ Servidor HTTP integrado en Java

---

## 🚀 **5. Próximos pasos**
- Practicar el uso de arreglos (arrays).
- Implementar clases más complejas con relaciones entre objetos.
- Profundizar en colecciones (`ArrayList`, `HashMap`).
- Trabajar con excepciones y manejo de errores.
- Profundizar en interfaces funcionales y expresiones lambda.
- Aprender sobre flujos de datos (Streams) en Java.

---

## 💡 **6. Recursos útiles**
- [Documentación oficial de Java](https://docs.oracle.com/en/java/)
- [Java Programming Tutorials - W3Schools](https://www.w3schools.com/java/)
- [Java Design Patterns](https://refactoring.guru/design-patterns/java)

---

**Autor:** Documentación personal de aprendizaje en Java 🚀

