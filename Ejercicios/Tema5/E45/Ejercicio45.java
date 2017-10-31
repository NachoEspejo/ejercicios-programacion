/**
 *Ejercicio 45
 *Escribe un programa que cambie un dígito dentro de un número dando la
 *posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 *empezando por el 1. Se recomienda usar long en lugar de int ya que el
 *primero admite números más largos. Suponemos que el usuario introduce
 *correctamente los datos.
 *
 *Ejemplo:
 *Por favor, introduzca un número entero positivo: 406783
 *Introduzca la posición dentro del número: 3
 *Introduzca el nuevo dígito: 1
 *El número resultante es 401783
 */

public class Ejercicio45 {
  public static void main(String[] args) {

    System.out.print("Introduce un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("Introduce la posición dentro del número: ");
    long posicion = Long.parseLong(System.console().readLine());

    System.out.print("Introduce el nuevo dígito: ");
    long digito = Long.parseLong(System.console().readLine());

    long n = numeroIntroducido;

    // longitud
    int longitud = 0;
    
    do {
      n /= 10;
      longitud++;
    } while (n > 0);
    
    // Izquierda con el nuevo digito
    long izquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    izquierda = izquierda * 10 + digito;
    
    // Derecha
    long derecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion));

    // Final
    n = izquierda * (long)(Math.pow(10, longitud - posicion)) + derecha;
    System.out.print("El número resultante es " + n);
  }
}
