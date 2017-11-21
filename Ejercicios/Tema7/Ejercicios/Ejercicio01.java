/**
 *Ejercicio 1
 *Define un array de 12 números enteros con nombre num y asigna los valores
 *según la tabla que se muestra a continuación. Muestra el contenido de todos
 *los elementos del array. ¿Qué sucede con los valores de los elementos que no
 *han sido inicializados?
 */

public class Ejercicio01 {
  public static void main(String[] args) {
  
    int[] num; // se define num como un array de enteros
    num = new int[12]; // se reserva espacio para 12 enteros
    num[0]=39;
    num[1]=-2;
    num[4]=0;
    num[6]=14;
    num[8]=5;
    num[9]=120;
    
    
    System.out.println("El array num contiene los siguientes elementos:");
    
    for (int i = 0; i < 12; i++) {
      System.out.println(num[i] + " ");
    }

  }
}
