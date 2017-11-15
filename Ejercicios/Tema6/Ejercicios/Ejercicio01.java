/**
 *Ejercicio 1
 *Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 *también la suma total (los puntos que suman entre los tres dados).
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    
    int suma = 0;
    String dado = "";
    int numeroTirada;
    
    System.out.println("Resultados de los 3 dados: ");
    
    for(int i = 1; i <= 3; i++) {
      numeroTirada = (int)(Math.random() * 6) + 1;
      switch(numeroTirada) {
        case 1:
          dado = "⚀ ";
          break;
        case 2:
          dado = "⚁ ";
          break;
        case 3:
          dado = "⚂ ";
          break;
        case 4:
          dado = "⚃ ";
          break;
        case 5:
          dado = "⚄ ";
          break;
        case 6:
          dado = "⚅ ";
          break;
        default:
      }
      System.out.println("Dado " + i + ": " + dado);
      suma += numeroTirada;
    }
    System.out.println();
    System.out.println("Suma: " + suma);
    
      }
}
