/**
 *Ejercicio 13
 *Escribe un programa que simule la tirada de dos dados. El programa deberá
 *continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 *dados tengan el mismo valor.
 */
 
public class Ejercicio13 {

  public static void main(String[] args) {

    int dado1;
    int dado2;
    String resultado1 = "";
    String resultado2 = "";
    
    do {
      dado1 = (int)(Math.random() * 6) + 1;
      dado2 = (int)(Math.random() * 6) + 1;
      switch(dado1) {
        case 1:
          resultado1 = "⚀ ";
          break;
        case 2:
          resultado1 = "⚁ ";
          break;
        case 3:
          resultado1 = "⚂ ";
          break;
        case 4:
          resultado1 = "⚃ ";
          break;
        case 5:
          resultado1 = "⚄ ";
          break;
        case 6:
          resultado1 = "⚅ ";
          break;
        default:
      }
        
      switch(dado2) {
        case 1:
          resultado2 = "⚀ ";
          break;
        case 2:
          resultado2 = "⚁ ";
          break;
        case 3:
          resultado2 = "⚂ ";
          break;
        case 4:
          resultado2 = "⚃ ";
          break;
        case 5:
          resultado2 = "⚄ ";
          break;
        case 6:
          resultado2 = "⚅ ";
          break;
        default:
      }
      System.out.println(resultado1 + " " + resultado2);
    } while (dado1 != dado2);
  }
}
