/**
 *Ejercicio 42
 *Escribe un programa que pida un número entero positivo por teclado y que
 *muestre a continuación los 5 números consecutivos a partir del número
 *introducido. Al lado de cada número se debe indicar si se trata de un primo o
 *no.
 *Ejemplo:
 *Por favor, introduzca un número entero positivo: 17
 *17 es primo
 *18 no es primo
 *19 es primo
 *20 no es primo
 *21 no es primo
 */
 
public class Ejercicio42 {

  public static void main(String[] args) {

    System.out.print("Introduce un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
       
    boolean esPrimo;

    for (int n = numeroIntroducido; n < numeroIntroducido + 5; n++) {

      // compruebación
      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }

      // mostrar
      if (esPrimo) {
        System.out.println("El número introducido, "+ n + ", es primo");
      } else {
        System.out.println("El número introducido, "+ n + " no es primo");
      }
    }
    System.out.println();
  }
}
