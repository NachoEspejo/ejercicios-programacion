/**
 *Ejercicio 5
 *Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
 *b = 0).
 */

public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.print("Introduce el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora introduce el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("No tiene una solucíon real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
