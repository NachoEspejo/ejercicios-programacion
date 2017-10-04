public class Ejercicio04 {
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    
    
    System.out.println("Lunes\tMartes\tMiercoles  Jueves  Viernes");
    System.out.println(naranja + "*****\t******\t*********  ******  *******");
    System.out.println(blanco + "PROGR\tSiste   Progr       Entorn  Siste");
    System.out.println("PROGR\tSiste\tProgr       Entorn  Siste");
    System.out.println("PROGR\tSiste\tProgr       Entorn  Siste");
    System.out.println(naranja + "RECR\tRECRE\tRECRE       RECRE   RECRE");
    System.out.println(blanco + "BBDD\tLengu\tBBDD        Lengu   Forma");
    System.out.println("BBDD\tProgr\tBBDD        Lengu   Forma");
    System.out.println("BBDD\tProgr\tBBDD        Lengu   Forma");
  }
}
