/**
 * 3. Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 */

public class Ejercicio03 {

  public static void main(String[] args) {
    
    int i = 0;
    
    System.out.println("Procesando datos...");
    
    do {
      System.out.println(i);
      i+=5;
    } while(i <= 100);
  }
}
