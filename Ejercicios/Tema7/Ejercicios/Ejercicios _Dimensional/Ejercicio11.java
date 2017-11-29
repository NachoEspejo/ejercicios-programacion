/**
 *Ejercicio 11
 *Realiza un programa que pida 10 números por teclado y que los almacene en
 *un array. A continuación se mostrará el contenido de ese array junto al índice
 *(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 *primos a las primeras posiciones, desplazando el resto de números (los que
 *no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 *el array resultante.
 */

public class Ejercicio11 {
  public static void main(String[] args) {
  
    int[] numero = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int i;
    int j;
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    String naranja = "\033[33m";
    String blanco = "\033[37m";
    
    System.out.println("Introduce 10 números separados por INTRO:");

    for (i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
      
      esPrimo = true; // Comprueba si el número es o no primo.
      for (j = 2; j < numero[i] - 1; j++) {
        if (numero[i] % j == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo) { // Si el número es primo, se mete en un array y si no es primo, se mete en otro diferente.
        primo[primos++] = numero[i];
      } else {
        noPrimo[noPrimos++] = numero[i];
      }
    }
    
    System.out.println("\n\nArray original:");  // Muestra el array original
    System.out.println(naranja + "\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐" + blanco);
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println(naranja + "│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤" + blanco);    
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", numero[i]);
    }
    System.out.println(naranja + "│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘" + blanco);
    
    for (i = 0; i < primos; i++) { // Los números primos se menten en las primeras posiciones del array original.
      numero[i] = primo[i];
    }
    
    for (i = primos; i < primos + noPrimos; i++) { // Los números que no son primos se colocan al final.
      numero[i] = noPrimo[i - primos];
    }
    
    System.out.println("\n\nArray con los primos al principio:");    // Muestra el resultado.
    System.out.println(naranja + "\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐" + blanco);
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println(naranja + "│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤" + blanco);    
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", numero[i]);
    }
    System.out.println(naranja + "│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘" + blanco);
    
  }
}
