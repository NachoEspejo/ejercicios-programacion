/**
 *Ejercicio 11
 *Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 *aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 *final aparecerá el número de suspensos, el número de suficientes, el número
 *de bienes, etc.
 */
 
public class Ejercicio11 {
  public static void main(String[] args) {
    
    
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
  
    for (int i = 1; i <= 20; i++) {
      int nota = (int)(Math.random()*11); 
      
      if (nota < 5) {
        System.out.println("Un " + nota + " es un Suspenso");
        suspenso++;
      }
      if ((nota >= 5) && (nota < 6)) {
        System.out.println("Un " + nota + " es un Suficiente");
        suficiente++;
      }
      
      if ((nota >= 6) && (nota < 7)) {
        System.out.println("Un " + nota + " es un Bien");
        bien++;
      }
      
      if ((nota >= 7) && (nota < 9)) {
        System.out.println("Un " + nota + " es un Notable");
        notable++;
      }
      if (nota >= 9) {
        System.out.println("Un " + nota + " es un Sobresaliente");
        sobresaliente++;
      }
    }
  
    System.out.println("Suspensos: " + suspenso);
    System.out.println("Suficientes: " + suficiente);
    System.out.println("Bienes: " + bien);
    System.out.println("Notables: " + notable);
    System.out.println("Sobresalientes: " + sobresaliente);
    
  }
}
