public class Pizzas {
  
  static int totalPedidas = 0;
  static int totalServidas = 0;
  
  String tamano;
  String tipo;
  String estado;
  
  public Pizzas(String t, String ta) {
    this.tipo = t;
    this.tamano = ta;
    this.estado = "pedida";
    Pizzas.totalPedidas++;
  }
  
  public String toString() {
    return "La pizza es de " + this.tipo + ", su tamaño es " + this.tamano + ", y actualmente está " + this.estado;
  }
  
  public static int getTotalPedidas() {
    return Pizzas.totalPedidas;
  }
  
  public static int getTotalServidas() {
    return Pizzas.totalServidas;
  }

  /**
   * ESTA SERVIDA O NO
   */
  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizzas.totalServidas++;
    } else {
      System.out.println("Esa pizza ya se ha servido");
    }
  }
}
