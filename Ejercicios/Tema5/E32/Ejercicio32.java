/**
 *Ejercicio 32
 *Escribe un programa que, dado un número entero, diga cuáles son y cuánto
 *suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 *izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 *números largos.
 *
 * Ejemplo 1:
 *Por favor, introduzca un número entero positivo: 94026782
 *Dígitos pares: 4 0 2 6 8 2
 *Suma de los dígitos pares: 22
 *
 *Ejemplo 2:
 *Por favor, introduzca un número entero positivo: 31779
 *Dígitos pares:
 *Suma de los dígitos pares: 0
 *
 *Ejemplo 3:
 *Por favor, introduzca un número entero positivo: 2404
 *Dígitos pares: 2 4 0 4
 *Suma de los dígitos pares: 10
 */
 
public class Ejercicio32 {

  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // Volteo y longitud
    long numero = numeroIntroducido;
    long volteado = 0;
    int longitud = 0;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 

    // Los pares estan aquí
    System.out.print("Dígitos pares: ");

    int digito;
    int sumaPares = 0;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado % 10);

      if ((digito % 2) == 0) {
        System.out.print(digito + " ");
        sumaPares += digito;
      }

      volteado /= 10;
    }
    
    // Suma par
    System.out.println();
    System.out.println("La suma de los dígitos pares es: " + sumaPares);
  }
}
