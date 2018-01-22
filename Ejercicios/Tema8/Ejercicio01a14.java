/**
 * 8. Funciones
 *
 * Ejercicios 1 a 14
 *
 */

import matemáticas.Varias;

public class Ejercicio01a14 {

  public static void main(String[] args) {

    System.out.println("Introduce un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    // esCapicua

    if (Varias.esCapicua(numeroIntroducido)) {
      System.out.println("El " + numeroIntroducido + " es capicúa");
    }else {
      System.out.println("El " + numeroIntroducido + " no es capicúa");
    }
    System.out.println();
    
    // esPrimo

    if (Varias.esPrimo(numeroIntroducido)) {
      System.out.println("El " + numeroIntroducido + " es primo");
    }else {
      System.out.println("El " + numeroIntroducido + " no es primo");
    }
    System.out.println();
    
    // siguientePrimo

    System.out.println("El siguiente primo mayor a " + numeroIntroducido + " es " + Varias.siguientePrimo(numeroIntroducido));
    System.out.println();
    
    // potencia
    System.out.println("Introduce un número entero, para que sea su base: ");
    int numeroBase = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    System.out.println("Introduce un número, para que sea su exponente: ");
    int numeroExponente = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    
    System.out.println("La base que es el " + numeroBase + " con un exponente de " + numeroExponente + " es igual a: " + Varias.potencia(numeroBase, numeroExponente));
    System.out.println();
    
    // digitos

    System.out.println("El número " + numeroIntroducido + " tiene " + Varias.digitos(numeroIntroducido) + " dígito/s.");
    System.out.println();
    
    // voltea

    System.out.println("El " + numeroIntroducido + " volteado es: " + Varias.voltea(numeroIntroducido));
    System.out.println();
    
    // digitoN
    System.out.println("Introduce un número, para saber la posición: ");
    int posicion = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    System.out.println("En la posición " + posicion + " del " + numeroIntroducido + " está el " + Varias.digitoN(numeroIntroducido, posicion));
    System.out.println();
    
    // posicionDeDigito 
    System.out.println("Introduce un número, que este en el numero introducido, para saber que posición ocupa: ");
    int posicionDigito = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    System.out.println("En el " + numeroIntroducido + ", el dígito " + posicionDigito + " está en la posición " + Varias.posicionDeDigito(numeroIntroducido, posicionDigito));
    System.out.println();
    
    // quitaPorDetras 
    System.out.println("¿Cuántos dígitos quieres que se quiten por detrás?: ");
    int quitarDetras = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    System.out.println("Si al " + numeroIntroducido + " se le quitan por detrás " + quitarDetras + " número/s, se queda como " + Varias.quitaPorDetras(numeroIntroducido, quitarDetras));
    System.out.println();
    
    // quitaPorDelante 
    System.out.println("¿Cuántos dígitos quieres que se quiten por delante?: ");
    int quitarDelante = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    System.out.println("Si al " + numeroIntroducido + " se le quitan por detrás " + quitarDelante + " número/s, se queda como " + Varias.quitaPorDelante(numeroIntroducido, quitarDelante));
    System.out.println();
    
    // pegaPorDetras 
    System.out.println("Introduce un número, para pegarlo por detrás: ");
    int pegarDetras = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    System.out.println("Si al " + numeroIntroducido + " se le pega el " + pegarDetras + " el pegarDetras da el " + Varias.pegaPorDetras(numeroIntroducido, pegarDetras));
    System.out.println();
    
    // pegaPorDelante 
    System.out.println("Introduce un número, para pegarlo por delante: ");
    int pegarDelante = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    System.out.println("Si al " + numeroIntroducido + " se le pega el " + pegarDelante + " el pegarDetras da el " + Varias.pegaPorDelante(numeroIntroducido, pegarDelante));
    System.out.println();
    
    // trozoDeNumero 
    System.out.println("Introduce un número, para que sea la posiciónn inicial: ");
    int digitoInicio = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.println("Introduce un número, para que sea la posiciónn final: ");
    int digitoFinal = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    System.out.println("Al " + numeroIntroducido + " le cojo el trozo que va de la posición " + digitoInicio + " a la " + digitoFinal + ", queda el número: " + Varias.trozoDeNumero(numeroIntroducido, digitoInicio, digitoFinal));
    System.out.println();

  }
}
