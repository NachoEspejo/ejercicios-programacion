/**
 *Ejercicio 13
 *Escribe un programa que rellene un array de 100 elementos con números ente-
 *ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 *el programa mostrará el array y preguntará si el usuario quiere destacar el
 *máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 *el número destacado entre dobles asteriscos.
 */

public class Ejercicio13 {

  public static void main(String[] args) {
  
    int[] n = new int[100];
    int maximo = 0;
    int minimo = 100;
    
    String rojo = "\033[31m";
    String naranja = "\033[33m";
    String blanco = "\033[37m";

    // Genera los números y calcula el máximo y el mínimo
    
    for (int i = 0; i < 100; i++) {
      n[i] = (int)(Math.random() * 501);
      
      if (n[i] < minimo) {
        minimo = n[i];
      }
      
      if (n[i] > maximo)  {
        maximo = n[i];
      }
    }

    // Muestra el array original
    for (int elemento : n) {
      System.out.print(elemento + " ");
    }
    System.out.println();
    System.out.println();
    System.out.println("¿Cuál quiere destarcar? (1 – mínimo, 2 – máximo): ");
    int opcion = Integer.parseInt(System.console().readLine());

    int destacado; // número que se va a destacar del resto
    
    if (opcion == 1) {
      destacado = minimo;
    } else {
      destacado = maximo;
    }

    System.out.println();

    // Muestra el resultado.
    for (int elemento : n) {
      if (elemento == destacado) {
        System.out.print(naranja + " **"+ rojo + elemento + naranja + "** " + blanco);
      } else {
        System.out.print(blanco + elemento + " ");
      }
    }
  }
}


