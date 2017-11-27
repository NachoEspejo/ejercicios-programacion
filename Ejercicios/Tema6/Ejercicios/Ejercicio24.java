/**
 *Ejercicio 24
 *Escribe un programa que, dado un número introducido por teclado, elija al azar
 *uno de sus dígitos.
 */
 
public class Ejercicio24 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    // Longitud
    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);

    // Posicion segun longitud
    int posicion = (int)(Math.random() * longitud) + 1;

    // Saca numero
    System.out.println((numeroIntroducido / (long)(Math.pow(10, longitud - posicion))) % 10);
  }
}
