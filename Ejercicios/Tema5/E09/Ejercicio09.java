/**
 * 9. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 */

public class Ejercicio09 {

  public static void main(String[] args) {
    
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println("El número introducido " + numeroIntroducido + " tiene un total de " + numeroDeDigitos + " dígito/s.");

  }
}
