/**
 *Ejercicio 23
 *Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 *Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 */
 
public class Ejercicio23 {

  public static void main(String[] args) {

    int dado;
    String dadoTipo = "";
    
    for(int i = 1; i <= 5; i++) {
      dado = (int)(Math.random() * 6) + 1;
      switch(dado) {
        case 1:
          dadoTipo = "🂡 ";
          break;
        case 2:
          dadoTipo = "🂮 ";
          break;
        case 3:
          dadoTipo = "🂭 ";
          break;
        case 4:
          dadoTipo = "🂫 ";
          break;
        case 5:
          dadoTipo = "➐ ";
          break;
        case 6:
          dadoTipo = "➑ ";
          break;
        default:
      }
      System.out.println();
      System.out.println("El dado " + i + " nos dio un/a " + dadoTipo );
      System.out.println();
    }
  }
}
