/**
 *Ejercicio 15
 *Escribe un programa que dados dos números, uno real (base) y un entero
 *positivo (exponente), saque por pantalla todas las potencias con base el
 *numero dado y exponentes entre uno y el exponente introducido. No se deben
 *utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 *se deberán mostrar 2^1 , 2^2 , 2^3 , 2^4 y 2^5.
 */
 
public class Ejercicio15 {

  public static void main(String[] args) {
  
    System.out.println("Introduce un número real como base: ");
    double base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce un número como exponente positivo: ");
    int expFinal = Integer.parseInt(System.console().readLine());

    double potencia;
    int exponente;
        
    for (int i = 1; i <= expFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int n = 0; n < exponente; n++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }

  }
}

