/**
 *Ejercicio 5
 *Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 *separados por espacios. Muestra también el máximo, el mínimo y la media
 *de esos números.
 */
 
public class Ejercicio05 {
  public static void main(String[] args) {
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int n;
    
    for (int i = 1; i <= 50; i++) {
      n = (int)(Math.random()*100) + 100;
      System.out.print(n + " ");
      suma += n;
      
      if (n < minimo) {
        minimo = n;
      }
      
      if (n > maximo) {
        maximo = n;
      }
    }
    
    System.out.println();
    System.out.println("Máximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + suma / 50);
    
  }
}
