public class Ejercicio05 {
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";
    
    
    
    System.out.println(morado + "Lunes\tMartes\tMiercoles  Jueves  Viernes");
    System.out.println(blanco + "*****\t******\t*********  ******  *******");
    System.out.println(rojo + "Progr" + naranja + "\tSiste"   + rojo + "\tProgr"       + celeste + "\tEntorn"  + naranja + "\tSiste");
    System.out.println(rojo + "Progr" + naranja + "\tSiste" + rojo + "\tProgr"        + celeste + "\tEntorn"  + naranja + "\tSiste");
    System.out.println(rojo + "Progr" + naranja + "\tSiste" + rojo + "\tProgr"       + celeste + "\tEntorn"  + naranja + "\tSiste");
    System.out.println(blanco + "RECRE\tRECRE\tRECRE \tRECRE \tRECRE");
    System.out.println(verde + "BBDD" + azul + "\tLengu" + verde +  "\tBBDD"        + azul + "\tLengu"   + morado + "\tForma");
    System.out.println(verde + "BBDD" + rojo + "\tProgr" + verde + "\tBBDD"        + azul + "\tLengu"   + morado + "\tForma");
    System.out.println(verde + "BBDD" + rojo + "\tProgr" + verde + "\tBBDD"        + azul + "\tLengu"   + morado + "\tForma");
  }
}
