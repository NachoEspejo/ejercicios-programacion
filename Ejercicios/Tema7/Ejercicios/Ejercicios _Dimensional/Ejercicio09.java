/**
 *Ejercicio 9
 *Realiza un programa que pida 8 números enteros y que luego muestre esos
 *números junto con la palabra “par” o “impar” según proceda.
 */

public class Ejercicio09 {
  public static void main(String[] args) {
  
    int[] numero = new int[8];
    int i;
    
    System.out.println("Introduce 8 números enteros, pulse INTRO después de cada número:");

    for (i = 0; i < 8; i++) { // Recoge los numeros introducidos
      numero[i] = Integer.parseInt(System.console().readLine());
    }

    for (i = 0; i < 8; i++) { // Determina si es par o impar
      if (numero[i] % 2 == 0) {
        System.out.println("El número " + numero[i] + " es par");
      } else {
        System.out.println("El número " + numero[i] + " es impar");
      }
    }
  }
}
