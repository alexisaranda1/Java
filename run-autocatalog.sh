#!/bin/bash

# AutoCatalog - Script de inicio
# Car Catalog Startup Script

echo "🚗 Iniciando AutoCatalog..."
echo "🚗 Starting AutoCatalog..."
echo ""

# Cambiar al directorio del proyecto
cd "$(dirname "$0")"

# Compilar el servidor Java
echo "📦 Compilando servidor Java..."
echo "📦 Compiling Java server..."
javac src/web/AutoCatalogServer.java

if [ $? -eq 0 ]; then
    echo "✅ Compilación exitosa"
    echo "✅ Compilation successful"
    echo ""
    
    # Ejecutar el servidor
    echo "🚀 Iniciando servidor web..."
    echo "🚀 Starting web server..."
    echo ""
    java -cp src web.AutoCatalogServer
else
    echo "❌ Error en la compilación"
    echo "❌ Compilation error"
    exit 1
fi