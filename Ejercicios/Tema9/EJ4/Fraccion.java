public class Fraccion {

  private int numerador;
  private int denominador;
  private int signo;
  
  
  public Fraccion(int num, int den) {
    if (den == 0) {
      System.out.println("El 0 como denominador, hace que la fraccion sea una indeterminacion");
    } else {
      if (num * den < 0) {
        this.signo = -1;
      } else {
        this.signo = 1;
      }
      this.numerador = Math.abs(num);
      this.denominador = Math.abs(den);
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
  public Fraccion multiplica(int numero) {
    return new Fraccion(this.signo * this.numerador * numero, this.denominador);
  }
  
  /**
   * MULTIPLICACION DE FRACCIONES
   */
  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(this.signo * f.getSigno() * this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
  }
  
  /**
   *  DIVISION DE UNA FRACCION CON NÚMERO
   */
  public Fraccion divide(int numero) {
    return new Fraccion(this.signo * this.numerador, this.denominador * numero);
  }
  
  /**
   * DIVISION DE FRACCIONES
   */
  public Fraccion divide(Fraccion f) {
    return new Fraccion(this.signo * f.getSigno() * this.numerador * f.getDenominador(), this.denominador * f.getNumerador());
  }
}
