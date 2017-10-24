/**
 * 5. Bucles
 * 
 * 23. Escribe un programa que permita ir introduciendo una serie indeterminada
 *     de números mientras su suma no supere  el valor 10000. Cuando esto último
 *     ocurra, se debe mostrar el total acumulado, el contador de los números
 *     introducidos y la media.
 */
public class Ejercicio23 {

  public static void main(String[] args) {

    System.out.println("Ve introduciendo números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
    
    int numeroIntroducido;
    int suma = 0;
    int cantidad = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      suma += numeroIntroducido;
      cantidad++;
    } while (suma <= 10000);
    
    System.out.println("Has insertado un total de " + cantidad + " números.");
    System.out.println("Su suma total es " + suma + ".");
    System.out.println("Su media es " + suma / cantidad + ".");
  }
}
