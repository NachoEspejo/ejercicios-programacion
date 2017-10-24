/**
 * 5. Bucles
 * 
 * 26. Realiza un programa que pida primero un número y a continuación un dígito. El programa nos
 *     debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en
 *     el número introducido.
 */
public class Ejercicio26 {

  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce un dígito, que este en el anterior número: ");
    int digito = Integer.parseInt(System.console().readLine());

    System.out.print("Contando de izquierda a derecha (Obviamente), el " + digito + " aparece dentro de " + numeroIntroducido + " en la/s siguiente/s posicion/es: ");
    
    
    int numero = numeroIntroducido;
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 
        
    while (volteado > 0) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;
      posicion++;
    } 

    System.out.println();
  }
}

