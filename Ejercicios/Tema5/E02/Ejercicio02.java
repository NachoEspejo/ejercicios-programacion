/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 */

public class Ejercicio02 {

  public static void main(String[] args) {
    
    int i = 0;
    
    System.out.println("Procesando datos...");
    
    while(i <= 100) {
      System.out.printf(i + "-");
      i+=5;
    }
  }
}
