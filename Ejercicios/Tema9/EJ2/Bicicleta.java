public class Bicicleta extends Vehiculo {

  private int piniones;
  
  public Bicicleta(int p) {
    super();
    this.piniones = p;
  }
  
  public void elCaballito() {
    System.out.println("Estoy haciendo el caballito(No hace KM's)");
  }
}
