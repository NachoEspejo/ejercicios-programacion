/**
 *Ejercicio 12
 *Realiza un programa que pida 10 números por teclado y que los almacene en
 *un array. A continuación se mostrará el contenido de ese array junto al índice
 *(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 *“inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 *ambos números están entre 0 y 9. El programa deberá colocar el número de
 *la posición inicial en la posición final, rotando el resto de números para que no
 *se pierda ninguno. Al final se debe mostrar el array resultante.
 *Por ejemplo, para inicial = 3 y final = 7:
 */

public class Ejercicio12 {

  public static void main(String[] args) {
  
    int[] n = new int[10];
    int[] resultado = new int[10];
    int i;
    int numeroInicial;
    int numeroFinal;
    boolean valido;
    
    System.out.println("Introduzca 10 números separados por INTRO:");

    for (i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    // Array original.  
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    
    do { // Pide las posiciones inicial y final.
      valido = true;
      
      System.out.print("Introduzca la posición inicial (0 - 9): ");
      numeroInicial = Integer.parseInt(System.console().readLine());
      if ((numeroInicial < 0) || (numeroInicial > 9)) {
        System.out.println("Error, el número debe estar entre el 0 y el 9.");
        valido = false;
      }
  
      System.out.print("Introduzca la posición final (0 - 9): ");
      numeroFinal = Integer.parseInt(System.console().readLine());
      if ((numeroFinal < 0) || (numeroFinal > 9)) {
        System.out.println("Error, el número debe estar entre el 0 y el 9.");
        valido = false;
      }
      
      if (numeroInicial >= numeroFinal) {
        System.out.println("Error, la posicioón inicial debe ser menor que la posición final.");
        valido = false;
      }
    } while (!valido); // HASTA AQUI TODO EASY

    for (i = 0; i < 10; i++) { // Copia el array n en resultado.
      resultado[i] = n[i];
    }
    
    resultado[numeroFinal] = n[numeroInicial];
    
    for (i = numeroFinal + 1; i < 10; i++)
      resultado[i] = n[i - 1];
    
    resultado[0] = n[9];
    
    for (i = 0; i < numeroInicial; i++)
      resultado[i + 1] = n[i];
    
    // Muestra el resultado.
    System.out.println("\nArray resultante:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", resultado[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");  
  }
}

