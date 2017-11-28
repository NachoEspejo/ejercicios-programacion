/**
 *Ejercicio 16
 *Escribe un programa que rellene un array de 20 elementos con números ente-
 *ros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
 *el programa mostrará el array y preguntará si el usuario quiere resaltar los
 *múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
 *array escribiendo los números que se quieren resaltar entre corchetes.
 */
 
public class Ejercicio16 {
  public static void main(String[] args) {
  
    int[] numeros = new int[20];

    for (int i = 0; i < 20; i++) {
      numeros[i] = (int)(Math.random() * 381) + 20;
      System.out.print(numeros[i] + " ");
    }
    
    System.out.println();
    System.out.println();
    System.out.print("Qué números quiere resaltar? ");
    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    int opciones = Integer.parseInt(System.console().readLine());
    
    int multiplos = 0;
    
    if(opciones == 1) {
        multiplos = 5;
        for (int elemento : numeros) {
          if (elemento % multiplos == 0) {
            System.out.print("[" + elemento + "] ");
          } else {
            System.out.print(elemento + " ");
          }
        }
    } else if (opciones == 2) { 
        multiplos = 7;
        for (int elemento : numeros) {
          if (elemento % multiplos == 0) {
            System.out.print("[" + elemento + "] ");
          } else {
            System.out.print(elemento + " ");
          }
        }
      } else {
        System.out.print("Lo de elegir entre el 1 y el 2, que no entiendes?");
        System.out.println("Ejecútame de nuevo, cuando sepas comprender.");
      }
      
  }
}

