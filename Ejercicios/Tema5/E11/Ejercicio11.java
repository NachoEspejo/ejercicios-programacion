/**
 *Ejercicio 11
 *Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 *los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */
 
public class Ejercicio11 {
  
  public static void main(String[] args) {
    
    System.out.println("Escribe el número que desees");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("Procesando...");
    
    System.out.println("╔════════════════════════════════╗");
    System.out.println("   Base     Base²     Base³   ");
    
    for (int n = numero; n < numero + 5; n++) {
      
      System.out.println("╔════════════════════════════════╗");
      System.out.printf("%6d %8d %10d\n", n, n * n, n * n * n);
      System.out.println("╚════════════════════════════════╝");
      
    }
  }
}
