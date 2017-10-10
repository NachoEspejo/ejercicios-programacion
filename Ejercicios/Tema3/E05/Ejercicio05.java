/**
*Ejercicio 5
*Escribe un programa que calcule el área de un rectángulo.
*/

public class Ejercicio05 {
  public static void main(String[] args) {
    
    System.out.println("Área de un rectángulo");
    
    System.out.print("Introduce la longitud de la base en cm: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la altura en cm: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.println("El área del rectángulo es " + (base * altura) + " cm2");
  
  }
}
