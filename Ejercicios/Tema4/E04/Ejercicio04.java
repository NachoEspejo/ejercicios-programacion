/**
 *Ejercicio 4
 *Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 *las horas extras. Escribe un programa que calcule el salario semanal de un
 *trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 *trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 *euros la hora
 */

public class Ejercicio04 {
  public static void main(String[] args) {

    int sueldoSemanal;

    System.out.print("Introduce cuantás horas trabajas a la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas < 40) {
      sueldoSemanal = (12 * horasTrabajadas);
    } else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);    
    }
    if (horasTrabajadas >= 168) {
      System.out.println("Tú o no tienes vida, o me estas mintiendo");
    }
    System.out.println("Consigues un total de " + sueldoSemanal + "€" + " a la semana, por trabajar " + horasTrabajadas + " horas");
  }
}
