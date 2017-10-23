/**
 * 5. Muestra los números del 320 al 160, contando de 20 en 20 hacia
 *    atrás utilizando un bucle while.
 */
public class Ejercicio05 {

  public static void main(String[] args) {
    
    int i = 320;
    
    System.out.println("Procesando datos...");
    
    while(i >= 160) {
        System.out.println(i);
        i-=20;
    }
  }
}
