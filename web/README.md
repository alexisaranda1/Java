# AutoCatalog - Catálogo de Autos

## 🚗 Descripción

AutoCatalog es una aplicación web para mostrar un catálogo de automóviles con un diseño moderno y una paleta de colores basada en el logo personalizado.

## 🎨 Características del Diseño

### Logo y Paleta de Colores
- **Logo personalizado**: SVG diseñado con un automóvil estilizado en tonos azules
- **Paleta de colores principal**:
  - `#1A365D` - Azul oscuro (primary-dark)
  - `#2C5282` - Azul principal (primary-main)  
  - `#4299E1` - Azul claro (primary-light)
  - `#BEE3F8` - Azul muy claro (primary-lighter)
- **Colores de acento**:
  - `#ED8936` - Naranja cálido para botones y precios
  - `#38A169` - Verde para estados exitosos
  - `#E53E3E` - Rojo para alertas

### Funcionalidades Web
- ✅ Catálogo de autos con filtrado por tipo (Sedán, SUV, Deportivo)
- ✅ Diseño responsive que se adapta a dispositivos móviles
- ✅ Animaciones suaves y efectos hover
- ✅ Navegación fluida con scroll suave
- ✅ Información detallada de cada vehículo (año, motor, transmisión, combustible)

## 🚀 Cómo Ejecutar

### Método 1: Usando Java (Recomendado)
```bash
# Desde el directorio raíz del proyecto
cd /home/runner/work/Java/Java

# Compilar el servidor
javac src/web/AutoCatalogServer.java

# Ejecutar el servidor
java -cp src web.AutoCatalogServer
```

### Método 2: Servidor web estático
Alternativamente, puedes servir los archivos del directorio `web/` con cualquier servidor web estático.

## 📁 Estructura del Proyecto

```
web/
├── index.html              # Página principal del catálogo
├── assets/
│   ├── css/
│   │   └── styles.css      # Estilos con paleta de colores
│   └── js/
│       └── main.js         # Funcionalidad del catálogo
└── README.md               # Esta documentación

src/web/
└── AutoCatalogServer.java  # Servidor HTTP en Java
```

## 🎯 Funcionalidades Implementadas

1. **Logo Personalizado**: SVG inline con diseño de automóvil en azules
2. **Paleta de Colores Cohesiva**: Basada en los colores del logo
3. **Catálogo Interactivo**: 
   - 9 automóviles de ejemplo
   - Filtrado por categorías
   - Tarjetas con información detallada
4. **Diseño Responsivo**: Se adapta a móviles y tabletas
5. **Servidor Java**: HTTP server integrado para servir la aplicación

## 🌐 Acceso

Una vez ejecutado el servidor, la aplicación estará disponible en:
**http://localhost:8080**

## 📱 Compatibilidad

- ✅ Navegadores modernos (Chrome, Firefox, Safari, Edge)
- ✅ Dispositivos móviles y tabletas
- ✅ Diferentes resoluciones de pantalla