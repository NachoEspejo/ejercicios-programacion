/**
 * 20. Realiza un programa que diga si un número entero positivo
 *     introducido por teclado es capicúa. Se permiten números de
 *     hasta 5 cifras
 */
 
public class Ejercicio20 {

  public static void main(String[] args) {
    
    int n;
    boolean capicua = false;
    
    System.out.print("Por favor, introducec un número entero de 5 cifras como máximo: ");
    n = Integer.parseInt(System.console().readLine());
    
    
    
    if (n < 10) {
      capicua = true;
    }
    
    
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        capicua = true;
      }
    }

    
    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        capicua = true;
      }
    }

    
    if ((n >= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
        capicua = true;
      }
    }
    
    
    if (n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println("El número introducido es capicúa.");
    } else {
      System.out.println("El número introducido no es capicúa.");
    }
  }
}
