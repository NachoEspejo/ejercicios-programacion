public class DimeTuNombre {
  public static void main(String[] args) {
  String nombre;

  System.out.print("Por favor, dime cómo te llamas: ");
  nombre = System.console().readLine();
  System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");
  }
}
