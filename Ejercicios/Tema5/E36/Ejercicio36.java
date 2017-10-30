/**
 *Ejercicio 36
 *Escribe un programa que diga si un número introducido por teclado es o no
 *capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 *programa debe aceptar números de cualquier longitud siempre que lo permita
 *el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 *long en lugar de int ya que el primero admite números más largos.
 *
 *Ejemplo 1:
 *Por favor, introduzca un número entero positivo: 678
 *El 678 no es capicúa.
 *
 *Ejemplo 2:
 *Por favor, introduzca un número entero positivo: 2019102
 *El 2019102 es capicúa.
 */
 public class Ejercicio36 {

  public static void main(String[] args) {

    System.out.print("Introduce un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // Voltea el número introducido.
    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    if (volteado == numeroIntroducido) {
      System.out.println("El " + numeroIntroducido + " es capicúa");
    } else {
      System.out.println("El " + numeroIntroducido + " no es capicúa");
    }
  }
}
