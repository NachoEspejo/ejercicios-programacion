/**
 * 
 * 8. Funciones
 * 
 * Ejercicios 20-28
 * 
 */
 
import Funciones.Arrays;

public class Ejercicio20a28 {

  public static void main(String[] args) {
    
    // Ejercicio 21
    System.out.print("Array original: ");
    int[] a = Funciones.Arrays.generaArrayInt(20, 0, 99);
    Funciones.Arrays.muestraArrayInt(a);   
    System.out.println();
     
    // Ejercicio 22,23,24
    System.out.println("Mínimo: " + Funciones.Arrays.minimoArrayInt(a));
    System.out.println("Máximo: " + Funciones.Arrays.maximoArrayInt(a));
    System.out.println("Media: " + Funciones.Arrays.mediaArrayInt(a));
    System.out.println();
    
    // Ejercicio 25
    if (Funciones.Arrays.estaEnArrayInt(a, 69)) {
      System.out.println("El 69 está en el array.");
    } else {
      System.out.println("El 69 no está en el array.");
    }
    System.out.println();
    
    
    // Ejercicio 26
    System.out.println("El 69 está en la posición " + Funciones.Arrays.posicionEnArrayInt(a, 69));
    System.out.println();
    
    
    // Ejercicio 27
    System.out.print("Array al revés: ");
    Funciones.Arrays.muestraArrayInt(Funciones.Arrays.volteaArrayInt(a));
    System.out.println();
    
    
    // Ejercicio 28
    System.out.print("Array rotado 3 pasos a la derecha: ");
    Funciones.Arrays.muestraArrayInt(Funciones.Arrays.rotaDerechaArrayInt(a, 3));
    System.out.println();
    
    
    // Ejercicio 29
    System.out.print("Array rotado 4 pasos a la izquierda: ");
    Funciones.Arrays.muestraArrayInt(Funciones.Arrays.rotaIzquierdaArrayInt(a, 4));
  }
}
