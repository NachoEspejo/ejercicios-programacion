/**
*Ejercicio 6
*Escribe un programa que calcule el área de un triángulo.
*/

public class Ejercicio06 {
  public static void main(String[] args) {
    
    System.out.println("Área de un rectángulo");
    
    System.out.print("Introduce la longitud de la base en cm: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la altura en cm: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.println("Y al dividirla entre dos");
    System.out.println("El área del triángulo es " + ((base * altura)/2) + " cm2");
  
  }
}
