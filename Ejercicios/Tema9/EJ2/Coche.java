public class Coche extends Vehiculo {

  private int caballosDeVapor;
  
  public Coche(){
    super();
  }

  public Coche(int cv) {
    super();
    this.caballosDeVapor = cv;
  }

  public void quemaRueda() {
    System.out.println("(Quemar rueda)");
  }
}
