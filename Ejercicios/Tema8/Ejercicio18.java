/**
 * 8. Funciones
 * 
 * Ejercicio 18
 *
 */
 
import matemáticas.Varias;

public class Ejercicio18 {

  public static void main(String[] args) {
    
    System.out.print("Introduce un número decimal para pasarlo a binario: ");
    int decimal = Integer.parseInt(System.console().readLine());
    
    System.out.println("El " + decimal + " en decimal, es " + decimalABinario(decimal) + " en binario.");
    
  }
  
  
  // ESTO ES LA FUNCION QUE PASA EL DECIMAL A BINARIO (NECESARIO EN EJ19)
  
  /**
   * Pasa un número decimal (en base 10) a binario (base 2).
   * 
   * @param decimal número entero en base 10
   * @return        número inicial pasado a binario
   */
  public static long decimalABinario(int decimal) {
  
    if (decimal == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (decimal > 1) {
      binario = Varias.pegaPorDetras(binario, decimal % 2);
      decimal = decimal / 2;
    }
    binario = Varias.pegaPorDetras(binario, 1);
    binario = Varias.voltea(binario);
    binario = Varias.quitaPorDetras(binario, 1);
    
    return binario;
  }
}
