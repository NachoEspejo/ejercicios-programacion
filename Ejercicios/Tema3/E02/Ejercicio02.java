/**
*Ejercicio 2
*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
*convertir debe ser introducida por teclado.
*/

public class Ejercicio02 {
  public static void main(String[] args) {
  String linea;
  int euros;
  double total;
  
  System.out.print("Cuantos euros tienes payo: ");
  linea = System.console().readLine();
  euros = Integer.parseInt( linea );
  
  total = (euros * 166.386);
  System.out.print("Al intercambiar " + euros + " Euros");
  System.out.println(" a pesetas ");
  System.out.print("Usted, tiene un total de ");
  System.out.print(total);
  System.out.print(" de pesetas");
  
  }
}
