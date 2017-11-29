/**
 *Ejercicio 17
 *Escribe un programa que muestre por pantalla un array de 10 números enteros
 *generados al azar entre 0 y 100. A continuación, el programa debe pedir
 *un número al usuario. Se debe comprobar que el número introducido por
 *teclado se encuentra dentro del array, en caso contrario se mostrará un
 *mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
 *introduzca uno correctamente. A continuación, el programa rotará el array
 *hacia la derecha las veces que haga falta hasta que el número introducido
 *quede situado en la posición 0 del array. Por último, se mostrará el array rotado
 *por pantalla.
 */
 
public class Ejercicio17 {
  public static void main(String[] args) {
  
    int[] numeros = new int[10];

    
    for (int i = 0; i < 10; i++) {
      numeros[i] = (int)(Math.random() * 101);
    }

    // Muestra el array original.
    System.out.println();
    System.out.println("Array original:");
    System.out.println();
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", numeros[i]);
    }
    
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    // Pide un número que esté dentro del array
    boolean existe = false;
    int numeroIntroducido;
    do {
      System.out.println();
      System.out.print("Introduce uno de los números, que se encuentre en el array. ");
      System.out.print("Dicho valor se movera a la derecha, hasta que lllege a la posición 0: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      for (int elemento : numeros) { // Comprueba si existe dicho numero
        if (elemento == numeroIntroducido) {
          existe = true;
        }
      }
      
      if (!existe) {
        System.out.println();
        System.out.print("Creo... que tienes que graduarte la vista, porque ese número no se encuentra en el array.");
        System.out.println(" Por favor, vuelva a intentarlo.");
        
      }
    } while (!existe);
    
    while (numeros[0] != numeroIntroducido) { // Rota hasta que se coloque en la posición 0
      int aux = numeros[9];
      
      for (int i = 9; i > 0; i--) {// Rotación a la derecha
        numeros[i] = numeros[i -1];
      }
      numeros[0] = aux;
    }
    System.out.println();
    System.out.println("Array modificado:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", numeros[i]);
    }
    
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘"); 
  }
}
