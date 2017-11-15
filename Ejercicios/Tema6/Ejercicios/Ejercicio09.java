/**
 *Ejercicio 9
 *Realiza un programa que vaya generando números aleatorios pares entre 0
 *y 100 y que no termine de generar números hasta que no saque el 24. El
 *programa deberá decir al final cuántos números se han generado.
 */
 
public class Ejercicio09 {
  public static void main(String[] args) {
    
    int numeroFin = 0;
    int cantidadNumeros = 0;
    
    while (numeroFin != 24) {
      numeroFin = (int)(Math.random() * 51);
      numeroFin = numeroFin * 2;
      System.out.print(numeroFin + " ");
      cantidadNumeros++;
    }
    
    System.out.println();
    System.out.println("Se han generado un total de " + cantidadNumeros + " números.");
  }
}
