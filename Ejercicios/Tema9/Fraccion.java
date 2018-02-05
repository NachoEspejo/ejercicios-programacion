public class Fraccion {

  private int numerador;
  private int denominador;
  private int signo;
  
  
  public Fraccion(int n, int d) {
    if (d == 0) {
      System.out.println("El 0 como denominador, hace que la fraccion sea una indeterminacion");
    } else {
      if (n * d < 0) {
        this.signo = -1;
      } else {
        this.signo = 1;
      }
      this.numerador = Math.abs(n);
      this.denominador = Math.abs(d);
    }
  }

  int getNumerador(){
    return this.numerador;
  }
  
  int getDenominador(){
    return this.denominador;
  }
  
  int getSigno(){
    return this.signo;
  }
  
  public String toString() {
    if (signo == -1) {
      return "-" + this.numerador + "/" + this.denominador;
    } else {
      return this.numerador + "/" + this.denominador;
    }
  }
  /**
   *  INVIERTE LOS DENOMINADORES Y NUMERADORES
   */
  public Fraccion invierte() {
   return new Fraccion(this.signo * this.denominador, this.numerador);
  }
  
  /**
   *  MULTIPLICACION DE UNA FRACCION CON NÚMERO
   */
  public Fraccion multiplica(int n) {
    return new Fraccion(this.signo * this.numerador * n, this.denominador);
  }
  
  /**
   * MULTIPLICACION DE FRACIONES
   */
   
  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(this.signo * f.getSigno() * this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
  }
}
