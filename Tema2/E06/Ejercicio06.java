/**
*Ejercicio 6
*Escribe un programa que calcule el total de una factura a partir de la base
*imponible (precio sin IVA). La base imponible estará almacenada en una
*variable.
* @author Nacho Espejo García
*/

public class Ejercicio06 {
  public static void main(String[] args) {
    
    double baseImponible = 1120;
    
    System.out.printf("Base imponible %4.2f\n", baseImponible);
    System.out.printf("IVA            %4.2f\n", (baseImponible * 0.21));
    System.out.printf("━━━━━━━━━━━━━━━━━━━━━━\n");
    System.out.printf("Total          %4.2f\n", (baseImponible * 1.21));
  }
}
