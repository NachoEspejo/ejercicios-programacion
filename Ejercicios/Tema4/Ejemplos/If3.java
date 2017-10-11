public class If3 {
  public static void main(String[] args) {
    
    System.out.print("¿Qué nota has sacado en el último examen? ");
    String line = System.console().readLine();
    double nota = Double.parseDouble( line );
    
    if (nota >= 5) {
      System.out.println("¡Enhorabuena!, ¡has aprobado!, !eres el amo¡");
    
    } else {
      System.out.println("Lo siento, has suspendido, mejor intentalo el próximo año.");
    }
    if (nota ==10){
      System.out.println("Te has ganado una matrícula de honor");
    }
  }
}
