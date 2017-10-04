public class Ejercicio03 {
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println(azul + "Inglés"      rojo + "Español");
    System.out.println(blanco + "-----------------------");
    System.out.printf("%-10s %s\n", "weakness", "debilidad");
    System.out.printf("%-10s %s\n", "student", "estudiante");
    System.out.printf("%-10s %s\n", "cat", "gato");
    System.out.printf("%-10s %s\n", "penguin", "pingüino");
    System.out.printf("%-10s %s\n", "saddle", "montura");
    System.out.printf("%-10s %s\n", "nature", "naturaleza");
    System.out.printf("%-10s %s\n", "darkness", "oscuridad");
    System.out.printf("%-10s %s\n", "green", "verde");
    System.out.printf("%-10s %s\n", "book", "libro");
    System.out.printf("%-10s %s\n", "young", "joven");
  }
}
