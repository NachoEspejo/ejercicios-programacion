/**
 *Ejercicio 44
 *Escribe un programa que sea capaz de insertar un dígito dentro de un número
 *indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 *resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 *izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 *correctamente los datos. Se recomienda usar long en lugar de int ya que el
 *primero admite números más largos.
 *
 *Ejemplo:
 *Por favor, introduzca un número entero positivo: 406783
 *Introduzca la posición donde quiere insertar: 3
 *Introduzca el dígito que quiere insertar: 5
 *El número resultante es 4056783.
 */
 
 public class Ejercicio44 {
  public static void main(String[] args) {

    System.out.print("introduce un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("Introduce la posición donde quiere insertar: ");
    long posicion = Long.parseLong(System.console().readLine());

    System.out.print("Introduce el dígito que quiere insertar: ");
    long digito = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    
    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    // parte izquierda con el dígito pegado
    long izquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    izquierda = izquierda * 10 + digito;
    
    // parte derecha
    long derecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion + 1));

    // resultado
    numero = izquierda * (long)(Math.pow(10, longitud - posicion + 1)) + derecha;
    System.out.print("El número resultante es " + numero);
  }
}
