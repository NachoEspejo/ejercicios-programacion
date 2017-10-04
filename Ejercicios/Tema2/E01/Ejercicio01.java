/**
* Ejercicio 1
*Escribe un programa en el que se declaren las variables enteras x e y . Asignales
*los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
*el valor de cada variable, la suma, la resta, la división y la multiplicación.
*@author Nacho Espejo García
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    
    int x = 144;
    int y = 999;
    int sum = x + y;
    int res = x - y;
    int mul = x * y;
    
    double div;
    div = (double)x / (double)y;
    
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);    
    System.out.println("[x + y] " + "Suma = " + sum);
    System.out.println("[x - y] " + "Resta = " + res);
    System.out.println("[x / y] " + "Division = " + div);
    System.out.println("[x * y] " + "Multiplicacion = " + mul);
    
    
  }
}
