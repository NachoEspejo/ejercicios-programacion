/**
 * 10. Escribe un programa que calcule la media de un conjunto de números
 *     positivos introducidos por teclado. A priori, el programa no sabe
 *     cuántos números se introducirán. El usuario indicará que ha terminado
 *     de introducir los datos cuando meta un número negativo.
 */

public class Ejercicio10 {

  public static void main(String[] args) {
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Calculador de medias de númmeros.");
    System.out.println("Introduce cualquier cantidad de números, cuando vaya a terminar introduce un número negativo:");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media de los números introducidos es " + (suma - numeroIntroducido)/ (numeros - 1));

  }
}
