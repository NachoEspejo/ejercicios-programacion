public class Ave extends Animal {
  
  public Ave() {
    super(Sexo.HEMBRA);
  }

  public Ave(Sexo s) {
    super(s);
  }
  
  public void poneHuevos() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("Soy macho... asi que hay un problema...");
    } else {
      System.out.println("Me salio un huevo o_O!");
    }
  }
  
  public void vuelaVuela() {
    System.out.println("Estoy volando wiiiiih");
  }
}
