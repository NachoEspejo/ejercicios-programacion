/**
*Ejercicio 4
*Escribe un programa que sume, reste, multiplique y divida dos números
*introducidos por teclado.
*/

public class Ejercicio04 {
  public static void main(String[] args) {
  String linea;
  int primerNumero;
  int segundoNumero;
  int totalSuma;
  int totalResta;
  int totalMulti;
  double totalDiv;
  
  System.out.print("Por favor, introduce un número: ");
  linea = System.console().readLine();
  primerNumero = Integer.parseInt( linea );
  
  System.out.print("Introduce otro número, o te rajo, gracias: ");
  linea = System.console().readLine();
  segundoNumero = Integer.parseInt( linea );
  
  totalSuma = (primerNumero + segundoNumero);
  System.out.print("Su suma es ");
  System.out.println(totalSuma);  
  
  totalResta = (primerNumero - segundoNumero);
  System.out.print("Su resta es ");
  System.out.println(totalResta);
  
  totalMulti = (primerNumero * segundoNumero);
  System.out.print("Su multiplicación es ");
  System.out.println(totalMulti);
  
  totalDiv = (primerNumero / segundoNumero);
  System.out.print("Su división es ");
  System.out.print(totalDiv);
  }
}
