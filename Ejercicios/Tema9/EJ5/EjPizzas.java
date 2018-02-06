public class EjPizzas {
  public static void main(String[] args) {
    Pizzas p1 = new Pizzas("margarita", "mediana");
    Pizzas p2 = new Pizzas("funghi", "familiar");
    p2.sirve();
    Pizzas p3 = new Pizzas("cuatro quesos", "mediana");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.sirve();
    System.out.println("Pizzas pedidas: " + Pizzas.getTotalPedidas());
    System.out.println("Pizzas servidas: " + Pizzas.getTotalServidas());    
  }
}
