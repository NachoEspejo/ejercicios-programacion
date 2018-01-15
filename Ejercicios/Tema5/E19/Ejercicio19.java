/**
 * 19. Realiza un programa que pinte una pirámide por pantalla. La altura
 *     se debe pedir por teclado. El carácter con el que se pinta la pirámide
 *     también se debe pedir por teclado.
 */
public class Ejercicio19 {

  public static void main(String[] args) {
    
    System.out.print("Introduce la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
  
    System.out.print("Introduce el carácter de relleno, que desees: ");
    String relleno = System.console().readLine();
    
    int h = 1;
    int i = 1;
    int huecos = alturaIntroducida - 1;
    
    while (h <= alturaIntroducida) {
      
      for (i = 1; i <= huecos; i++) { // inserta los espacios
        System.out.print(" ");
      }

      for (i = 1; i < h * 2; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      h++;
      huecos--;
    }
  }
}
