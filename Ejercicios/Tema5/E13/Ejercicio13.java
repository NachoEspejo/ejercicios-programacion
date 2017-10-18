/**
 *Ejercicio 13
 *Escribe un programa que lea una lista de diez números y determine cuántos
 *son positivos, y cuántos son negativos.
 */
 
public class Ejercicio13 {

  public static void main(String[] args) {
  
    System.out.println("Introduce 10 números enteros: ");

    int negativo = 0;
    int positivo = 0;
    
    for (int n = 0; n < 10; n++) {
      if (Integer.parseInt(System.console().readLine()) > 0) {
        positivo++;
      } else {
        negativo++;
      }
    }
    
    System.out.println("Has introducido un total de " + positivo + " positivos y " + negativo + " negativos");

  }
}
