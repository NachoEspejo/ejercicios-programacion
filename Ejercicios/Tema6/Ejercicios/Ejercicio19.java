/**
 *Ejercicio 19
 *Escribe un programa que muestre 50 números enteros aleatorios comprendi-
 *dos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 *luego el máximo de los pares el mínimo de los impares y la media de todos los
 *números generados.
 */
 
 
public class Ejercicio19 {
  public static void main(String[] args) {

    int numero;
    int media = 0;
    int maximoPar = -100;
    int minimoImpar = 200;
    
    for (int i = 0; i < 50; i++) {
      numero = (int)(Math.random() * 301 - 100);
      
      System.out.print(numero + " ");
      
      if (numero % 2 == 0) { // PAR
        if (numero > maximoPar) {
        maximoPar = numero;
        }
      } else { // IMPAR
        if (numero < minimoImpar) {
        minimoImpar = numero;
        }
      }
      
      media += numero;
    }
    System.out.println();
    System.out.println("El más grande de los pares es el: " + maximoPar);
    System.out.println("El mas chico de los impares es el: " + minimoImpar);
    System.out.println("La media de los números generados es: " + (media / 50));
  }
}
