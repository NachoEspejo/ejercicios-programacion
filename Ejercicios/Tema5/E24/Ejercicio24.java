/**
 * 5. Bucles
 * 
 * 24. Escribe un programa que lea un número N e imprima una pirámide de números con N filas como
 *     en la siguiente figura: 
 *          1 
 *         121
 *        12321 
 *       1234321
 
 */
public class Ejercicio24 {

  public static void main(String[] args) {
    
    System.out.println("Este programa pinta una pirámide hecha a base de números (De un solo dígito).");
    System.out.print("Introduce la altura de la pirámide:");
    int hIntroducida = Integer.parseInt(System.console().readLine());

    int h = 1;
    int i = 0;
    int espacios = hIntroducida - 1;
    
    while (h <= hIntroducida) {
      

      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      for (i = 1; i < h; i++) {
        System.out.print(i);
      }
      
      for (i = h; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      h++;
      espacios--;
    } 
  }
}
