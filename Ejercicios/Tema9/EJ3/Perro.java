public class Perro extends Mamifero  {

 public Perro (Sexo s) {
    super(s);
  }

  public Perro () {
    super(Sexo.HEMBRA);
  }
  
  
  public void dameLaPata() {
    System.out.println("Toma mi patita");
  }
  
  public void ladra() {
    System.out.println("Guauh!");
  }
}
