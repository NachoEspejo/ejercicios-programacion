/**
 *Ejercicio 8
 *Muestra la tabla de multiplicar de un número introducido por teclado.
 */
 
public class Ejercicio08 {
  
  public static void main(String[] args) {
    
    System.out.println("Escribe el número que desees, y te hare su tabla de multiplicación");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("Procesando...");
    
    for(int i = 0; i <= 20; i ++ ) {
      System.out.println(numero + " x " + i + " = " + numero * i);
      
    }
    System.out.println("Listo");
  }
}
