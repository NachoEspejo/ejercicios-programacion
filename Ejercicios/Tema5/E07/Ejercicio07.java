/**
 * 7. Realiza el control de acceso a una caja fuerte. La combinación
 *    será un número de 4 cifras. El programa nos pedirá la combinación
 *    para abrirla. Si no acertamos, se nos mostrará el mensaje
 *    “Lo siento, esa no es la combinación” y si acertamos se nos dirá
 *    “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
 *    oportunidades para abrir la caja fuerte.
 */
public class Ejercicio07 {

  public static void main(String[] args) {
    
    int intentos = 4;
    int numero;
    boolean acertado = false;
    
    do {
      System.out.print("Introduzca la clave de la caja fuerte (4 dígitos): ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero == 1248) {
        acertado = true;
      } else {
        System.out.println("☠ Clave incorrecta ☠");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Ha abierto la caja fuerte. Disfrute de sus ganancias. ⛂ ⛂ ⛃ ⛃ ⛃ ");
    } else {
      System.out.println("♜ Se ha avisado a la policia, por intento de robo, por favor no se resista. ♜");
    }
  }
}
