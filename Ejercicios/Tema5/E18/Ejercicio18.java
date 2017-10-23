/**
 * 18. Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 */

public class Ejercicio18 {

  public static void main(String[] args) {
    
    int primerNumero;
    int segundoNumero;
    
  
    do {
      System.out.print("Introduce un número entero, que va a ser el número máximo: ");
      primerNumero = Integer.parseInt(System.console().readLine()); //Este es el tope que va a llegar
      System.out.print("Introduce otro número entero distinto al anterior, siendo este, menor al anterior: ");
      segundoNumero = Integer.parseInt(System.console().readLine()); //De aquí es de donde parte
      
      if(primerNumero == segundoNumero) {
        System.out.println("Los números introducidos son iguales , deben ser distintos.");
      }
    } while (primerNumero == segundoNumero);
  
  
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
  }
}
