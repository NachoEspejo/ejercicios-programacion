/**
 * 5. Bucles
 * 
 * 21. Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
 *    nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
 *    El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no
 *    se incluye en el cómputo.
 */
public class Ejercicio21 {

  public static void main(String[] args) {
    
    System.out.println("Ve introduciendo números enteros.");
    System.out.println("Cuando quieras terminar, introduce un número negativo.");

    int numeroIntroducido;
    int cantidad = 0;
    int sumaImpares = 0;
    int cantidadImpares = 0;
    int maximoPar = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido >= 0) {
        cantidad++;
        if ((numeroIntroducido % 2) == 1) { // Esta sección resuelve el número impar
          sumaImpares += numeroIntroducido;
          cantidadImpares++;
        } else { // Esta sección resuelve el número par
          if (numeroIntroducido > maximoPar)
            maximoPar = numeroIntroducido;
        }
      }
    } while (numeroIntroducido >= 0);

    System.out.println("Ha introducido una cantidad de " + cantidad + " números");
    System.out.println("La media de los impares introducidos es " + sumaImpares/cantidadImpares);
    System.out.println("El máximo de los pares introducidos es " + maximoPar);
  }
}
