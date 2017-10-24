/**
 * 5. Bucles
 * 
 * 27. Escribe un programa que muestre, cuente y sume los  múltiplos de 3 que hay entre 1 y un
 *     número leído por teclado.
 */
public class Ejercicio27 {

  public static void main(String[] args) {
      
    System.out.print("Introduce un número entero mayor que 1: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int cuenta = 0;
    int suma = 0;
    
    System.out.println(" ");
    
    System.out.println("Procesando...");
    
    for (int i = 1; i < numeroIntroducido; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
    
    System.out.println(" ");
    
    System.out.println("Listo");
    
    System.out.println(" ");
        
    System.out.println("Desde ❶  hasta el número " + numeroIntroducido + " hay un total de " + cuenta +  " múltiplos de ❸  y que suman " + suma);
  }
}
