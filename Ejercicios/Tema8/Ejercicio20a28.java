/**
 * 
 * 8. Funciones
 * 
 * Ejercicios 20-28
 * 
 */
 
import funciones.Arrays;

public class Ejercicio20a28 {

  public static void main(String[] args) {
    
    // Ejercicio 20
    System.out.print("Array original: ");
    int[] a = funciones.Arrays.generaArrayInt(20, 0, 99);
    funciones.Arrays.muestraArrayInt(a);   
    System.out.println();
     
    // Ejercicio 21,22,23
    System.out.println("Mínimo: " + funciones.Arrays.minimoArrayInt(a));
    System.out.println("Máximo: " + funciones.Arrays.maximoArrayInt(a));
    System.out.println("Media: " + funciones.Arrays.mediaArrayInt(a));
    System.out.println();
    
    // Ejercicio 24
    if (funciones.Arrays.estaEnArrayInt(a, 69)) {
      System.out.println("El 69 está en el array.");
    } else {
      System.out.println("El 69 no está en el array.");
    }
    System.out.println();
    
    
    // Ejercicio 25
    System.out.println("El 69 está en la posición " + funciones.Arrays.posicionEnArrayInt(a, 69));
    System.out.println();
    
    
    // Ejercicio 26
    System.out.print("Array al revés: ");
    funciones.Arrays.muestraArrayInt(funciones.Arrays.volteaArrayInt(a));
    System.out.println();
    
    
    // Ejercicio 27
    System.out.print("Array rotado 3 pasos a la derecha: ");
    funciones.Arrays.muestraArrayInt(funciones.Arrays.rotaDerechaArrayInt(a, 3));
    System.out.println();
    
    
    // Ejercicio 28
    System.out.print("Array rotado 4 pasos a la izquierda: ");
    funciones.Arrays.muestraArrayInt(funciones.Arrays.rotaIzquierdaArrayInt(a, 4));
  }
}
