/**
 *Ejercicio 14
 *Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 *El programa intentará adivinar el número que estás pensando - un número
 *entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 *programa debe preguntar si el número que estás pensando es mayor o menor
 *que el que te acaba de decir.
 */
 
public class Ejercicio14 {
  public static void main(String[] args) {
    
    int minimo = 0;
    int maximo = 100;
    boolean acertado = false;
    int opciones;
    int vidas = 5;
    int numeroIA;
        
    System.out.println("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos.");
    System.out.println("Pulsa INTRO cuando lo hayas pensado.");
    System.console().readLine();

    do {
      vidas--;
      numeroIA = (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("Mmnnnn es el... " + "¿" + numeroIA + "?");
      System.out.println("El número que estás pensando es 1) Mayor 2) Menor 3) Igual");
      System.out.println("Me quedan un total de: " + vidas + " vidas");
      System.out.print("Opción: ");
      opciones = Integer.parseInt(System.console().readLine());
      

      if ( (opciones == 1) && (vidas > 0) )
        minimo = numeroIA + 1;
      
      if ( (opciones == 2) && (vidas > 0) )
        maximo = numeroIA - 1;
      
      if (opciones == 3) {
        acertado = true;
        System.out.println("He acertado, en tu cara crack!!!");
      }
    } while(!acertado && (vidas > 0));
    
    if (!acertado) {
      System.out.println("No es mi culpa que no haya acertado, es tu culpa por programarme asi.");
    }
  }
}
