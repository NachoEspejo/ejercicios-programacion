/**
 * 8. Funciones
 *
 * Ejercicio 15
 *
 */
 
import matemáticas.Varias;

public class Ejercicio15 {

  public static void main(String[] args) {

    System.out.println("Los números primos de 1 a 1000 son: ");
    
    for(int i = 1; i <= 1000; i++) {
      if (Varias.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
