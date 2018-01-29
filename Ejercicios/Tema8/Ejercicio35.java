/**
 * 
 * 8. Funciones
 * 
 * Ejercicios 35
 * 
 */
import java.util.Scanner;
import funciones.Palotes;

public class Ejercicio35 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el número que quiere pasar a palotes: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println("Su numero convertido al sistema de palotes es: " + Palotes.convierteEnPalotes(numero));
  }
}
