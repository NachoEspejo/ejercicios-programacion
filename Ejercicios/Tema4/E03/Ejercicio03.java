/**
 *Ejercicio 3
 *Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 *diente nombre del día de la semana.
 */
 
public class Ejercicio03 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Introduce un número del 1 al 7, y te diré a que día de la semana corresponde: ");
    int num = Integer.parseInt(System.console().readLine());

    switch(num) {
      case 1:
        dia = "lunes";
        break;
      case 2:
        dia = "martes";
        break;
      case 3:
        dia = "miércoles";
        break;
      case 4:
        dia = "jueves";
        break;
      case 5:
        dia = "viernes";
        break;
      case 6:
        dia = "sábado";
        break;
      case 7:
        dia = "domingo";
        break;
      default:
        dia = "Que yo sepa, una semana tiene 7 dias solo, a no ser que seas de otro planeta.";
    }
    
    System.out.println(dia);

  }
}
