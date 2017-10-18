/**
 *Ejercicio 14
 *Escribe un programa que pida una base y un exponente (entero positivo) y
 *que calcule la potencia.
 */
 
public class Ejercicio14 {

  public static void main(String[] args) {
  
    System.out.println("Introduce un número como base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce un número como exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int n = 0; n < exponente; n++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int n = 0; n < -exponente; n++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    System.out.println(base + "^" + exponente + " = " + potencia);
  }
}
