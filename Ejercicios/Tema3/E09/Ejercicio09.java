/**
*Ejercicio 9
*Escribe un programa que calcule el volumen de un cono según la fórmula V =
*1/3  * πr^2*h
*/

public class Ejercicio09 {
  public static void main(String[] args) {
    
    double pi = 3.141592654;


    System.out.println("Volumen de un cono");
    System.out.print("Introduzca la altura en cm: ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el radio en cm: ");
    double r = Double.parseDouble(System.console().readLine());
    double v = (pi * r * r * h)/3;
    System.out.println("El volumen del cono es de " +  v + " cm3");
  }
}
