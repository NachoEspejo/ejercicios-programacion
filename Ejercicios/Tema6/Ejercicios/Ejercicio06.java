/**
 *Ejercicio 6
 *Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 *debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 *fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
 *ducido es menor o mayor que el número secreto.
 */
 
public class Ejercicio06 {
  public static void main(String[] args) {
    
    int misterio = (int)(Math.random()*101);
    int vidas = 5;
    int numeroIntroducido;
    boolean acertado = false;
    
    
    System.out.println("Adivina un número de 0 a 100. Tienes 5 oportunidades");
    
    do {
      System.out.print("Introduce un número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      vidas--;

      if ((numeroIntroducido > misterio) && (vidas > 0)){
        System.out.println("El número es menor que " + numeroIntroducido);
        System.out.println("Te quedan " + vidas + " oportunidades.");
        System.out.println();
      }
      
      if ((numeroIntroducido < misterio) && (vidas > 0)){
        System.out.println("El número es mayor que " + numeroIntroducido);
        System.out.println("Te quedan " + vidas + " oportunidades.");
        System.out.println();
      }
      
      if (numeroIntroducido == misterio) {
        acertado = true;
        System.out.println("¡Has acertado, enhorabuena!");
        System.out.println();
      }
    } while (!acertado && (vidas > 0));
    
    if (!acertado) {
      System.out.println("Que pena tio, el número era el " + misterio);
    }
  }
}
