/**
 * 8. Funciones
 *
 * Ejercicio 16
 *
 */

import matemáticas.Varias;

public class Ejercicio16 {

  public static void main(String[] args) {

    System.out.println("Los números capicúa que hay entre 1 y 99999 son: ");
    
    for(int i = 1; i <= 99999; i++) {
      if (Varias.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }

  }
}
