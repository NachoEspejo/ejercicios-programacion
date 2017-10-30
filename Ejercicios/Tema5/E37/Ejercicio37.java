/**
 *Ejercicio 37
 *Realiza un conversor del sistema decimal al sistema de “palotes”.
 *
 *Ejemplo:
 *Por favor, introduzca un número entero positivo: 47021
 *El 470213 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes
 */
 public class Ejercicio37 {

  public static void main(String[] args) {

    System.out.println("Bienvenido al convertidor de Palitos v1.0 by NachoEspejoGarcia");
    System.out.println("Introduce un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // Voltea el número introducido 
    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } 

    // Los palotes van aqui
    int palotes;
    
    while (volteado > 0) {
      palotes = (int)(volteado % 10); // último dígito de volteado
      // Pinta aqui
      for (int i = 0; i < palotes; i++) {
        System.out.print("|");
      }
      if (volteado > 10) { // para no pintar el último guión
        System.out.print(" - ");
      }
      volteado = volteado / 10; 
    }  
  }
}
