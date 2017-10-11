/**Ejercicio 6
 *Realiza un programa que calcule el
 *tiempo que tardará en caer un objeto desde
 *una altura h. Aplica la fórmula t = √(2h/g) siendo g = 9.81m/s
 */
 
public class Ejercicio06 {
  public static void main(String[] args) {
    
    System.out.print("Introduce una altura en metros, para saber desde qué altura se cae Batman: ");
    double h = Double.parseDouble(System.console().readLine());
    double g = 9.81;
    
    double t = Math.sqrt(2*h/g);

    System.out.printf("Batman tardará %.2f s en meterse una ostia.\n", t);
  }
}
