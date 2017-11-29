/**
 *Ejercicio 6
 *Escribe un programa que lea 15 números por teclado y que los almacene en un
 *array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 *debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 *la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 *del array.
 */

public class Ejercicio06 {
  public static void main(String[] args) {
  
    int[] numero = new int[15];
    int i;
    
    System.out.println("El programa siguiente le va a pedir 15 números");
    System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
    
    for (i = 0; i < 15; i++) { // Introducir numeros //
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    System.out.println("Array original");
    for (i = 0; i < 15; i++) { // Array introducido //
      System.out.printf("│%3d ", i);
    }
    System.out.println("│");
    System.out.print("├");
    for (i = 0; i < 74; i++) {
      System.out.print("─");
    }
    System.out.println("┤");
    for (i = 0; i < 15; i++) {
      System.out.printf("│%3d ", numero[i]);
    }
    System.out.println("│"); // Array introducido //
    
    
    int aux = numero[14]; // Rotacion //
    for (i = 14; i > 0; i--) {
      numero[i] = numero[i-1];
    }
    numero[0] = aux; // Rotacion //
    
    System.out.println();
    System.out.println("Array rotado");
    for (i = 0; i < 15; i++) { // Array rotado //
      System.out.printf("│%3d ", i);
    }
    System.out.println("│");
    System.out.print("├");
    for (i = 0; i < 74; i++) {
      System.out.print("─");
    }
    System.out.println("┤");
    for (i = 0; i < 15; i++) {
      System.out.printf("│%3d ", numero[i]);
    }
    System.out.println("│"); // Array rotado //
  }
}
