/**
 *Ejercicio 15
 *Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 *sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 *(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 *el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 *si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
 *mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
 *personas como máximo e intente de nuevo”. Para el grupo que llega,
 *se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
 *libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
 *grupo es de dos personas, se podrá colocar donde haya una o dos personas.
 *Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
 *vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
 *Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
 *funcionamiento del programa se ilustra a continuación:
 */
 
public class Ejercicio15 {
  public static void main(String[] args) {

    int[] mesa = new int[10];

    for (int i = 0; i < 10; i++) { // Rellena las mesas de forma aleatoria.
      mesa[i] = (int)(Math.random() * 5);
    }

    int clientes;
    
    System.out.print("DISPONIBILIDAD ACTUAL DEL RESTAURANTE CAMPANILLAS ⭐ ⭐ ⭐ ⭐");
    
    do{
      // Muestra el estado de ocupación de las mesas actual
      System.out.println("\n┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
      System.out.print("│Mesa nº: ");
      for (int i = 1; i < 11; i++) {
        System.out.printf("│ %2d ", i);
      }
      System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
      System.out.print("│Ocupación");
      for (int m : mesa) {
        System.out.printf("│ %2d ", m);
      }
      System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
      
      System.out.println("¿Cuántos comensales son? (Introduzca -1 para salir del programa): ");
      clientes = Integer.parseInt(System.console().readLine());
     
      if (clientes > 4) { // comprueba si el grupo de clientes es mayor a 4
        System.out.print("Lo siento, no admitimos grupos de 5 o más, haga grupos de");
        System.out.println(" 4 personas como máximo e intente de nuevo.");
      } else {
        // Busca una mesa vacía.
        int vacia = 0;
        boolean hayMesaVacia = false;
        for(int i = 9; i >= 0; i--) {
          if (mesa[i] == 0) {
            vacia = i;
            hayMesaVacia = true;
          }
        }
        
        if (hayMesaVacia) {
          mesa[vacia] = clientes; // coloca a los clientes en la mesa libre
          System.out.println("Sientese en la mesa número " + (vacia + 1) + ".");
        } else {
          // Busca un hueco para todo el grupo.
          int hueco = 0;
          boolean hayHueco = false;
          for(int i = 9; i >= 0; i--) {
            if (clientes <= (4 - mesa[i])) {
              hueco = i;
              hayHueco = true;
            }
          }
          
          if (hayHueco) {
            mesa[hueco] += clientes; // coloca a los clientes en el primer hueco disponible
            System.out.println("Tendrán que compartir mesa y por favor, no se coma a su compañero. Por favor, siéntense en la mesa número " + (hueco + 1) + ".");
          } else {
            System.out.println("Lo siento, en estos momentos estamos llenos, por favor espere, hasta que tengamos sitio.");
          }
        }
      }
    } while (clientes != -1);

  }
}
