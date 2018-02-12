public class Pinguino extends Ave {

  public Pinguino() {}

  public Pinguino(Sexo s) {
    super(s);
  }

  public void Linux() {
    System.out.println("Soy el pinguino que aparece en Linux");
  }

  public void nadar() {
    System.out.println("Estoy nadando");
  }
    
  public void vuelaVuela() {
    System.out.println("I believe i can fly, but NO!");
  }
  
}
