/**
 * 6. Muestra los números del 320 al 160, contando de 20 en 20
 *    utilizando un bucle do-while.
 */

public class Ejercicio06 {

  public static void main(String[] args) {
    
    int i = 320;
    
    System.out.println("Procesando datos...");
    
    do {
      System.out.println(i);
      i-=20;
    } while(i >= 160);
  }
}
