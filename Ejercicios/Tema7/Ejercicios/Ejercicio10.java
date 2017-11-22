/**
 *Ejercicio 10
 *Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 *y que los almacene en un array. El programa debe ser capaz de pasar todos
 *los números pares a las primeras posiciones del array (del 0 en adelante) y
 *todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
 *es necesario.
 */

public class Ejercicio10 {
  public static void main(String[] args) {
  
    int[] numero = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int i;
    int pares = 0;
    int impares = 0;
    
    for (i = 0; i < 20; i++) { // Asigna los valores a los numeros de  0-100
      numero[i] = (int)(Math.random() * 101);
      if (numero[i] % 2 == 0) { // Separa los números metiendo los pares en un array y los impares en otro.
        par[pares++] = numero[i];
      } else {
        impar[impares++] = numero[i];
      }
    }
    
    System.out.println("Array original:"); // Array original
    for (i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
    System.out.println();
    
    for (i = 0; i < pares; i++) { // Mete los pares en las primeras posiciones
      numero[i] = par[i];
    }
    
    for (i = pares; i < 20; i++) {// Mete los impares en los huecos que quedan.
      numero[i] = impar[i - pares];
    }
  
    System.out.println();
    System.out.println("Array con los pares al principio:"); // Array modificado
    for (i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
    
  }
}
