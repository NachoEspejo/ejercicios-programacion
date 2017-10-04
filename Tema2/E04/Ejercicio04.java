/**
*Ejercicio 4
*Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
*convertir deberá estar almacenada en una variable.
* @author Nacho Espejo García
*/

public class Ejercicio04 {
  public static void main(String[] args) {
    
    double euros = 100.00;
    int pesetas = (int) (euros * 166.386);
    
    System.out.print("Mis " + euros + " euros son " + pesetas + " en pesetas.");
  }
}
