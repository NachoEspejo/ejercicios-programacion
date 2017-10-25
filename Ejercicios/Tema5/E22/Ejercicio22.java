/**
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 22
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
public class Ejercicio22 {

  public static void main(String[] args) {

    System.out.println("Números primos entre 2 y 100: ");

    boolean esPrimo = true;

    for (int n = 2; n <= 100; n++) {

      // Zona de comprobación primítica
      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }

      // si n es primo, se muestra por pantalla en 4K 100%Real NoFake
      if (esPrimo) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
  }
}
