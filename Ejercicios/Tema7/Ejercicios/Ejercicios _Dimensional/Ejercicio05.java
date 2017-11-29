/**
 *Ejercicio 5
 *Escribe un programa que pida 10 números por teclado y que luego muestre
 *los números introducidos junto con las palabras “máximo” y “mínimo” al lado
 *del máximo y del mínimo respectivamente.
 */

public class Ejercicio05 {
  public static void main(String[] args) {
  
    int[] numero = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int i;
    
    System.out.println("El programa siguiente le va a pedir 10 números");
    System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
    
    for (i = 0; i < 10; i++) { // Determina el minimo y el maximo
      numero[i] = Integer.parseInt(System.console().readLine());
      
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
      
      if (numero[i] > maximo)  {
        maximo = numero[i];
      }
    }
    
    System.out.println();
      
    for (i = 0; i < 10; i++) { // el numero[i] mas grande se le añade un "maximo"
      System.out.print(numero[i]);
      if (numero[i] == maximo) {
        System.out.print(" máximo");
      }
      
      if (numero[i] == minimo) {// el numero[i] mas pequeño se le añade un "minimo"
        System.out.print(" mínimo");
      }
      System.out.println();
    }
  }
}
