/**
 *Ejercicio 1
 *Escribe un programa que pida por teclado un día de la semana y que diga qué
 *asignatura toca a primera hora ese día.
 */

public class Ejercicio01 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Introduce un día de la semana y descubre que asignatura tienes a primera hora: ");
    dia = (System.console().readLine()); 
    dia = dia.toLowerCase();
    
    switch(dia) {
      case "lunes":
        System.out.println("Programación");
        break;
      case "martes":
        System.out.println("Sistemas Informáticos");
        break;
      case "miércoles":
        System.out.println("Programación");
        break;
      case "jueves":
        System.out.println("Entornos de Desarrollo");
        break;
      case "viernes":
        System.out.println("Lenguaje de Marcas");
        break;
      case "sabado":
        System.out.println("!Estas loco! Los sabados no hay clase");
        break;
      case "domingo":
        System.out.println("¡Este día es de relax!");
        break;
      default:
        System.out.println("No te inventes dias de la semana...");
    }
  }
}

