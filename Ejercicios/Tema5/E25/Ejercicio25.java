/**
 * 5. Bucles
 * 
 * 25. Realiza un programa que pida un número por teclado y que luego
 *     muestre ese número al revés.
 */
public class Ejercicio25 {

  public static void main(String[] args) {

    System.out.print("Introduce un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int n = numeroIntroducido;
    int volteado = 0;
    
    while (n > 0) {
      volteado = (volteado * 10) + (n % 10);
      n /= 10;
    } 
    
    while (n < 0) {
      volteado = (volteado * 10) + (n % 10);
      n /= 10;
    } 
    
    System.out.println("Si le damos la vuelta al número " + numeroIntroducido + " obtenemos el " + volteado);
  }
}
