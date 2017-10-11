public class If {
  public static void main(String[] args) {

    System.out.print("¿Cuál es la capital de Kiribati? ");
    String respuesta = System.console().readLine();
    
    if (respuesta.equals("Tarawa")) {
    System.out.println("¡La respuesta es correcta, eres el amo crack!");
    } else {
    System.out.println("La respuesta es incorrecta, necesitas estudiar más.");
    }
  }
}
