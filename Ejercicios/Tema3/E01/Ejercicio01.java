/**
* Ejercicio 1
*Realiza un programa que pida dos números y que luego muestre el resultado
*de su multiplicación.
*/
public class Ejercicio01 {
  public static void main(String[] args) {
  String linea;
  int primerNumero;
  int segundoNumero;
  int total;
  
  System.out.print("Por favor, introduce un número: ");
  linea = System.console().readLine();
  primerNumero = Integer.parseInt( linea );
  
  System.out.print("Introduce otro número, o te rajo, gracias: ");
  linea = System.console().readLine();
  segundoNumero = Integer.parseInt( linea );
  
  total = (primerNumero * segundoNumero);
  System.out.print("El primer número introducido es " + primerNumero);
  System.out.println(" y el segundo es " + segundoNumero);
  System.out.print("Su multiplicación es ");
  System.out.print(total);
  }
}
