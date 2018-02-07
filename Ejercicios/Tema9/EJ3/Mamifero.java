public abstract class Mamifero extends Animal {

  public Mamifero () {
    super();
  }

  public Mamifero (Sexo s) {
    super(s);
  }
  
  public void cuidaCrias() {
    System.out.println("No hagas eso, que te vas a hacer daño");
  }
}
