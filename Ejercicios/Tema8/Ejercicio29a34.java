/**
 * 
 * 8. Funciones
 * 
 * Ejercicios 29-34
 * 
 */
 
import funciones.ArraysBidi;

public class Ejercicio29a34 {

  public static void main(String[] args) {
    
    // Ejercicio 29
    System.out.println("Generación, y muestra del Array Bidimensional: ");
    int[][] a = funciones.ArraysBidi.generaArrayBiInt(5, 8, 0, 100);
    funciones.ArraysBidi.muestraArrayBiInt(a);
    
    // Ejercicio 30
    System.out.print("\nFila 2: ");
    funciones.Arrays.muestraArrayInt(funciones.ArraysBidi.filaDeArrayBiInt(a, 2));    
    
    // Ejercicio 31
    System.out.print("\nColumna 6: ");
    funciones.Arrays.muestraArrayInt(funciones.ArraysBidi.columnaDeArrayBiInt(a, 6));
    
    // Ejercicio 32
    System.out.print("\nCoordenadas del 24 (fila, columna): ");
    funciones.Arrays.muestraArrayInt(funciones.ArraysBidi.coordenadasEnArrayBiInt(a, 24));
    System.out.println();
    
    // Ejercicio 33
    System.out.println("Array Bidimensional (3x3): ");
    int[][] b = {{11, 10, 9}, {4, 5, 7}, {2, 6, 1}};
    funciones.ArraysBidi.muestraArrayBiInt(b);    
    System.out.println("\nBusca los puntos de silla, en el array anterior: ");
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        if (funciones.ArraysBidi.esPuntoDeSilla(b, i, j)) {
          System.out.println("fila " + i + ", columna " + j + " -> "  + b[i][j]);
        }
      } // for j
    } // for i
    System.out.println();
    
    // Ejercicio 34
    System.out.println("Vamos a hacer diagonales con los números: ");
    funciones.ArraysBidi.muestraArrayBiInt(a);    
    System.out.print("\nFila: ");
    int fila = Integer.parseInt(System.console().readLine());
    System.out.print("Columna: ");
    int columna = Integer.parseInt(System.console().readLine());
    System.out.print("Dirección (nose/neso): ");
    String direccion = System.console().readLine();
    System.out.print("\nDiagonal: ");
    funciones.Arrays.muestraArrayInt(funciones.ArraysBidi.diagonal(a, fila, columna, direccion));
  }

}
