public class EjPizzas {
  public static void main(String[] args) {
    Pizzas p1 = new Pizzas("margarita", "mediana");
    Pizzas p2 = new Pizzas("funghi", "familiar");
    Pizzas p3 = new Pizzas("cuatro quesos", "mediana");
    p2.sirve();
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.sirve();
    System.out.println("pedidas: " + Pizzas.getTotalPedidas());
    System.out.println("servidas: " + Pizzas.getTotalServidas());    
  }
}
