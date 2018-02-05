public class EjFraccion {
  public static void main(String[] args) {
    
    Fraccion fraccion1 = new Fraccion(-1,2);
    Fraccion fraccion2 = new Fraccion(-1,2);
    System.out.println("Al invertir " + fraccion1 + " el resultado es: " + fraccion1.invierte());
    System.out.println("La" + fraccion1 + " al multiplicarse por 5 da: " + fraccion1.multiplica(5));
    System.out.println("La" + fraccion1 + " al multiplicarse por " + fraccion2 + " da como resultado: " + fraccion1.multiplica(fraccion2));
    
    
  }
}
