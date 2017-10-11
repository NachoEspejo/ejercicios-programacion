/**
*Ejercicio 8
*Escribe un programa que calcule el salario semanal de un empleado en base
*a las horas trabajadas, a razón de 12 euros la hora.
*/

public class Ejercicio08 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    System.out.println("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
    
  }
}
