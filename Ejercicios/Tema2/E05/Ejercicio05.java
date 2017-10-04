/**
*Ejercicio 5
*Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
*convertir deberá estar almacenada en una variable.
* @author Nacho Espejo García
*/

public class Ejercicio05 {
  public static void main(String[] args) {
    
    int pesetas = 1000;
    double euros = pesetas / 166.386;
    
    System.out.println("Mis " + pesetas + " pesetas son en verdad " + euros + " euros hoy en dia");
    
    System.out.printf("Mis %d pesetas son más o menos %.2f euros.\n", pesetas, euros);
  }
}
