/**Ejercicio 20
 *Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 *agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 *cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 *pueda admitir. El ancho de la cuba no varía.
 */

public class Ejercicio20 {
  public static void main(String[] args) {

    System.out.print("Indica la capacidad de la cuba en litros: ");
    int capacidad = Integer.parseInt(System.console().readLine());

    int litros = (int)(Math.random() * (capacidad + 1));  
        
    for (int i = 0; i < capacidad; i++) {
      if (i < (capacidad - litros)) {
        System.out.println("┃    ┃");
      } else {
        System.out.println("┃▒▒▒▒┃"); 
      }
    }
        
    System.out.println("┗━━━━┛"); // fondo de la cuba
    System.out.print("La cuba tiene una capacidad de " + capacidad);
    System.out.print(" litros y contiene " + litros + " litros de agua.");
  }
}
