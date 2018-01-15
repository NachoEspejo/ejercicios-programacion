/**
 *Ejercicio 25
 *Escribe un programa que muestre por pantalla 100 números enteros separa-
 *dos por un espacio. Los números deben estar generados de forma aleatoria
 *en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 *almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 */

public class Ejercicio25 {
  public static void main(String[] args) {

    System.out.print("Aparecerán 100 numeros aleatorios, los primos estarán con");
    System.out.println(" ## y los multiplos de 5 con []");
    System.out.println();

    for (int i = 0; i < 100; i++) {
      int numeroRandom = (int)(Math.random() * 191) + 10;

      // Comprueba primo
      boolean esPrimo = true;
      for (int j = 2; j < numeroRandom; j++) {
        if ((numeroRandom % j) == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo) { // Si es primo
        System.out.print(" #" + numeroRandom + "# ");
      } else if ((numeroRandom % 5) == 0) { // Si es múltiplo de 5
        System.out.print(" [" + numeroRandom + "]z   ");
      } else { // Si no es primo ni multiplo de 5
        System.out.print(" " + numeroRandom + " ");
      }
    }
  }
}
