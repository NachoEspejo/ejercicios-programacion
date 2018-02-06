public class Perro extends Mamifero  {

  private String raza;
  
  Perro() {}
  
  Perro (String r) {
    this.raza = r;
  }
  
  
  public void dameLaPata() {
    System.out.println("Toma mi patita");
  }
  
  public void ladra() {
    System.out.println("Guauh!");
  }
}
