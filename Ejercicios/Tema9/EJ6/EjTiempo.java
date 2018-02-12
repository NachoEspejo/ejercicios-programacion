public class EjTiempo {
  
  public static void main(String[] args) {
    Tiempo t1 = new Tiempo(1, 20, 30);
    Tiempo t2 = new Tiempo(0, 30, 40);
    Tiempo t3 = new Tiempo(0, 35, 20);
    Tiempo t4 = new Tiempo(100000);
        
    System.out.println(t1);
    System.out.println(t2 + " + " + t3 + " = " + t2.suma(t3));
    System.out.println(t1 + " - " + t3 + " = " + t1.resta(t3));
    System.out.println(t1 + " - " + t2 + " - " + t3 + " = " + t1.resta(t2.suma(t3)));
    System.out.println(t3 + " - " + t1 + " = " + t3.resta(t1));
    System.out.println("100000 segundos son: " + t4);
  }
}
