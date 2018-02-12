public class Pizzas {
  
  static int totalPedidas = 0;
  static int totalServidas = 0;
  
  String tamanio;
  String tipo;
  String estado;
  
  public Pizzas(String t, String tam) {
    this.tipo = t;
    this.tamanio = tam;
    this.estado = "pedida";
    Pizzas.totalPedidas++;
  }
  
  public String toString() {
    return "La pizza es de " + this.tipo + ", su tamaño es " + this.tamanio + ", y actualmente está " + this.estado;
  }
  
  /**
   * COMPRUEBA SI ESTA SERVIDA O NO
   */
  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizzas.totalServidas++;
    } else {
      System.out.println("Esa pizza ya se ha servido con anterioridad");
    }
  }
  
  public static int getTotalPedidas() {
    return Pizzas.totalPedidas;
  }
  
  public static int getTotalServidas() {
    return Pizzas.totalServidas;
  }


}
