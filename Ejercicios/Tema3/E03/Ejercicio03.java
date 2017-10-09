/**
*Ejercicio 3
*Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
*convertir debe ser introducida por teclado
*/

public class Ejercicio03 {
  public static void main(String[] args) {
  String linea;
  double pesetas;
  double total;

  
  System.out.print("Cuantos pesetas quieres cambiar: ");
  linea = System.console().readLine();
  pesetas = Integer.parseInt( linea );
  
  total = (pesetas / 166.378);
  System.out.print("Al intercambiar " + pesetas + " pesetas");
  System.out.println(" a Euros ");
  System.out.print("Usted, tiene un total de ");
  System.out.print(total);
  System.out.print(" Euros");
  
  }
}
