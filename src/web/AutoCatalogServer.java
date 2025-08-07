package web;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple HTTP Server to serve the AutoCatalog web application
 * 
 * This server serves static files (HTML, CSS, JS) for the car catalog web page.
 * It includes a logo and color palette as requested.
 */
public class AutoCatalogServer {
    private static final int PORT = 8080;
    private static final String WEB_ROOT = "web";
    
    // MIME types for different file extensions
    private static final Map<String, String> MIME_TYPES = new HashMap<>();
    
    static {
        MIME_TYPES.put("html", "text/html");
        MIME_TYPES.put("css", "text/css");
        MIME_TYPES.put("js", "application/javascript");
        MIME_TYPES.put("png", "image/png");
        MIME_TYPES.put("jpg", "image/jpeg");
        MIME_TYPES.put("jpeg", "image/jpeg");
        MIME_TYPES.put("gif", "image/gif");
        MIME_TYPES.put("svg", "image/svg+xml");
        MIME_TYPES.put("ico", "image/x-icon");
    }

    public static void main(String[] args) {
        try {
            AutoCatalogServer server = new AutoCatalogServer();
            server.start();
        } catch (Exception e) {
            System.err.println("Error starting server: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void start() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
        
        // Handle all requests
        server.createContext("/", new StaticFileHandler());
        
        // Set executor (null means default)
        server.setExecutor(null);
        
        // Start the server
        server.start();
        
        System.out.println("=".repeat(60));
        System.out.println("🚗 AutoCatalog Server Started Successfully! 🚗");
        System.out.println("=".repeat(60));
        System.out.println("📍 Server running on: http://localhost:" + PORT);
        System.out.println("🌐 Open your browser and navigate to the URL above");
        System.out.println("📁 Serving files from: " + WEB_ROOT + " directory");
        System.out.println("⚡ Press Ctrl+C to stop the server");
        System.out.println("=".repeat(60));
        System.out.println("\n📋 Features:");
        System.out.println("  ✅ Car catalog with filtering");
        System.out.println("  ✅ Custom logo with matching color palette");
        System.out.println("  ✅ Responsive design");
        System.out.println("  ✅ Blue color scheme based on logo");
        System.out.println();
    }

    static class StaticFileHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String requestPath = exchange.getRequestURI().getPath();
            
            // Default to index.html for root path
            if (requestPath.equals("/")) {
                requestPath = "/index.html";
            }
            
            // Build file path
            Path filePath = Paths.get(WEB_ROOT + requestPath);
            
            try {
                if (Files.exists(filePath) && !Files.isDirectory(filePath)) {
                    // File exists, serve it
                    serveFile(exchange, filePath);
                } else {
                    // File not found
                    serve404(exchange);
                }
            } catch (Exception e) {
                // Server error
                serve500(exchange, e);
            }
        }
        
        private void serveFile(HttpExchange exchange, Path filePath) throws IOException {
            byte[] fileBytes = Files.readAllBytes(filePath);
            String fileName = filePath.getFileName().toString();
            String extension = fileName.substring(fileName.lastIndexOf('.') + 1).toLowerCase();
            
            // Set content type
            String contentType = MIME_TYPES.getOrDefault(extension, "application/octet-stream");
            exchange.getResponseHeaders().set("Content-Type", contentType);
            
            // Add cache headers for static assets
            if (!extension.equals("html")) {
                exchange.getResponseHeaders().set("Cache-Control", "public, max-age=3600");
            }
            
            // Send response
            exchange.sendResponseHeaders(200, fileBytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(fileBytes);
            }
            
            System.out.println("✅ Served: " + filePath + " (" + fileBytes.length + " bytes)");
        }
        
        private void serve404(HttpExchange exchange) throws IOException {
            String response = createErrorPage(404, "Not Found", "The requested file was not found.");
            exchange.getResponseHeaders().set("Content-Type", "text/html");
            exchange.sendResponseHeaders(404, response.getBytes().length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
            
            System.out.println("❌ 404: " + exchange.getRequestURI().getPath());
        }
        
        private void serve500(HttpExchange exchange, Exception e) throws IOException {
            String response = createErrorPage(500, "Internal Server Error", 
                "An error occurred: " + e.getMessage());
            exchange.getResponseHeaders().set("Content-Type", "text/html");
            exchange.sendResponseHeaders(500, response.getBytes().length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
            
            System.out.println("💥 500: " + e.getMessage());
        }
        
        private String createErrorPage(int code, String title, String message) {
            return "<!DOCTYPE html>" +
                   "<html><head><title>" + code + " - " + title + "</title>" +
                   "<style>body{font-family:Arial;text-align:center;padding:50px;color:#333;}" +
                   "h1{color:#E53E3E;}</style></head>" +
                   "<body><h1>" + code + " - " + title + "</h1>" +
                   "<p>" + message + "</p>" +
                   "<a href='/'>← Back to AutoCatalog</a></body></html>";
        }
    }
}