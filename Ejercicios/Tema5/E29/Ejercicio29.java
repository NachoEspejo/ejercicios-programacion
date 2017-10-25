/**
 *Ejercicio 29
 *Escribe un programa que muestre por pantalla todos los números enteros
 *positivos menores a uno leído por teclado que no sean divisibles entre otro
 *también leído de igual forma.
 */
 
public class Ejercicio29 {

  public static void main(String[] args) {

    System.out.print("Introduce un número entero positivo, a ser posible bien grande: ");
    int numeroGrande = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce otro número, a ser posible que sea chico: ");
    int numeroChico = Integer.parseInt(System.console().readLine());

    System.out.print("Los números enteros positivos menores que " + numeroGrande );
    System.out.println(" que no son divisibles entre " + numeroChico + " son los siguientes:");

    int cuenta = 0;
    int suma = 0;

    for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroChico) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
