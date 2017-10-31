/**
 *Ejercicio 43
 *Escribe un programa que permita partir un número introducido por teclado en
 *dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 *el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 *el número introducido tiene dos dígitos como mínimo y la posición en la que
 *se parte el número está entre 2 y la longitud del número. No se permite en
 *este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 *subcadenas dentro de una cadena).
 *  
 *Ejemplo:
 *Por favor, introduzca un número entero positivo: 406783
 *Introduzca la posición a partir de la cual quiere partir el número: 5
 *Los números partidos son el 4067 y el 83.
 */
 
 public class Ejercicio43 {
  public static void main(String[] args) {

    System.out.print("Introduce un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("Introduce una posición : ");
    long posicion = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;
    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    
    long izquierda = numeroIntroducido / (long)(Math.pow(10, (longitud - posicion + 1)));
    
    
    long derecha = numeroIntroducido % (long)(Math.pow(10, (longitud - posicion + 1)));

    System.out.print("Los números partidos son el " + izquierda + " y  el " + derecha + ".");
  }
}
