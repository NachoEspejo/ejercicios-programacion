/**
 *Ejercicio 4
 *Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) sepa-
 *rados por espacios.
 */

public class Ejercicio04 {
  public static void main(String[] args) {
    
    for (int i = 0; i < 20; i++) {
      System.out.print((int)(Math.random()*11) + " ");
    }
    
    System.out.println();
  }
}
