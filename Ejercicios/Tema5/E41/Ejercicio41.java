/**
 *Ejercicio 41
 *Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 *hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 *primero admite números más largos.
 *
 *Ejemplo 1:
 *Por favor, introduzca un número entero positivo: 406783
 *El 406783 contiene 4 dígitos pares y 2 dígitos impares.
 *Ejemplo 2:
 *
 *Por favor, introduzca un número entero positivo: 3177840
 *El 3177840 contiene 3 dígitos pares y 4 dígitos impares.
 */

public class Ejercicio41 {
  public static void main(String[] args) {

    System.out.print("Introduce un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    long n = numeroIntroducido;
    int Pares = 0;
    int Impares = 0;
        
    while (n > 0) {
      if ((n % 10) % 2 == 0) {
        Pares++;
      } else {
        Impares++;
      }
      n /= 10;
    }
    System.out.print("El " + numeroIntroducido + " contiene " + Pares + " dígitos pares y " + Impares + " dígitos impares.");
  }
}
