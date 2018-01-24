/**
 * Tema 8
 *
 * Ejercicio 19
 * 
 */

import java.util.Scanner;
import funciones.*;

public class Ejercicio19 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la base de origen: ");
    System.out.println("1.- Decimal.");
    System.out.println("2.- Binario.");
    System.out.println("3.- Hexadecimal.");
    System.out.println("4.- Octal.");
    int tipoOrigen = s.nextInt();
    System.out.println();

    System.out.print("Introduce el número que quiere cambiar de base: ");
    int numero = s.nextInt();
    System.out.println();
    
    System.out.println("Ahora escriba el a que tipo quiere cambiar: ");
    System.out.println("1.- Decimal.");
    System.out.println("2.- Binario.");
    System.out.println("3.- Hexadecimal.");
    System.out.println("4.- Octal.");
    int tipoFinal = s.nextInt();
    System.out.println();
    
    if (tipoOrigen == 1) {
      switch (tipoFinal) {
        case 1:
          System.out.println("Su número ya está en decimal.");
          break;
        case 2:
          System.out.println("Su número en binario es: " + tipoNumeros.binario(numero));
          break;
        case 3:
          System.out.println("Su número en hexadecimal es: " + tipoNumeros.hexadecimal(numero));
          break;
        case 4:
          System.out.println("Su número en octal es: " + tipoNumeros.octal(numero));
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
    if (tipoOrigen == 2) {
      switch (tipoFinal) {
        case 1:
          System.out.println("Su número en decimal es: " + tipoNumeros.decimal(numero));
          break;
        case 2:
          System.out.println("Su número ya está en binario.");
          break;
        case 3:
          numero = tipoNumeros.decimal(numero);
          System.out.println("Su número en hexadecimal es: " + tipoNumeros.hexadecimal(numero));
          break;
        case 4:
          numero = tipoNumeros.decimal(numero);
          numero = tipoNumeros.octal(numero);
          System.out.println("Su número en octal es: " + numero);
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
    if (tipoOrigen == 3) {
      switch (tipoFinal) {
        case 1:
          System.out.println("Su número en decimal es: " + tipoNumeros.hexaDec(numero));
          break;
        case 2:
          numero = tipoNumeros.hexaDec(numero);
          System.out.println("Su número en binario es: " + tipoNumeros.binario(numero));
          break;
        case 3:
          System.out.print("Su número ya está en hexadecimal.");
          break;
        case 4:
          numero = tipoNumeros.hexaDec(numero);
          System.out.println("Su número en octal es: " + tipoNumeros.octal(numero));
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
    if (tipoOrigen == 4) {
      switch (tipoFinal) {
        case 1:
          numero = tipoNumeros.octalDec(numero);
          System.out.println("Su número en decimal es: " + numero);
          break;
        case 2:
          numero = tipoNumeros.octalDec(numero);
          numero = tipoNumeros.binario(numero);
          System.out.println("Su número en binario es: " + numero);
          break;
        case 3:
          numero = tipoNumeros.octalDec(numero);
          System.out.println("Su número en hexadecimal es: " + tipoNumeros.hexadecimal(numero));
          break;
        case 4:
          System.out.print("Su número ya está en octal.");
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
  }  
}
