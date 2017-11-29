/**
 *Ejercicio 7
 *Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 *muestre por pantalla separados por espacios. El programa pedirá entonces
 *por teclado dos valores y a continuación cambiará todas las ocurrencias del
 *primer valor por el segundo en la lista generada anteriormente. Los números
 *que se han cambiado deben aparecer entrecomillados.
 */

public class Ejercicio07 {
  public static void main(String[] args) {
  
    int[] numero = new int[100];
    int i;
    String naranja = "\033[33m";
    String blanco = "\033[37m";

    for (i = 0; i < 100; i++) {
    numero[i] = (int)(Math.random()*21); // Esto genera un numero de 0-20
    }
    
    for (i = 0; i < 100; i++) { // Esto muestra los 100 numeros
    System.out.print(numero[i] + " ");
    }
    
    System.out.println();
    System.out.println("Introduce un número mostrado: ");
    int valor1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el valor para sustituirlo: ");
    int valor2 = Integer.parseInt(System.console().readLine());

    System.out.println();
    
    for (i = 0; i < 100; i++) { // Cambio de valor y destacarlo
      if (numero[i] == valor1) { 
        numero[i] = valor2;
        System.out.print(naranja + "**" + numero[i] + "**  ");
      } else {
        System.out.print(blanco + numero[i] + "  ");
      }
    }
  }
}
