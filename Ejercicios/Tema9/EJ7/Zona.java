public class Zona {
  
  private int entradasPorVender;
  
  public Zona(int n){
    entradasPorVender = n;
  }
  
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  
  /**
   * Vende un número de entradas.
   */
  public void vender(int n) {
    
    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, las entradas para esa zona están agotadas.");
      System.out.println();
    } else if (this.entradasPorVender < n) {
      System.out.println("Sólo me quedan " + this.entradasPorVender + " entradas para esa zona.");
      System.out.println();
    }
    
    if (this.entradasPorVender >= n) {
      entradasPorVender -= n;
      System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
      System.out.println();
    }
  }
}
