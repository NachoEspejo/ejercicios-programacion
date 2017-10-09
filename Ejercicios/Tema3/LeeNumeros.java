public class LeeNumeros {
  public static void main(String[] args) {
  
  String linea;
  int primerNumero;
  int segundoNumero;
  int total;
  
  System.out.print("Por favor, introduce un número: ");
  linea = System.console().readLine();
  primerNumero = Integer.parseInt( linea );
  
  System.out.print("introduce otro, por favor: ");
  linea = System.console().readLine();
  segundoNumero = Integer.parseInt( linea );
  
  total = (2 * primerNumero) + segundoNumero;
  System.out.print("El primer número introducido es " + primerNumero);
  System.out.println(" y el segundo es " + segundoNumero);
  System.out.print("El doble del primer número más el segundo es ");
  System.out.print(total);
  }
}
