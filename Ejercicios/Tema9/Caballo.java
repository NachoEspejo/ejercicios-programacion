public class Caballo {
  
  private String nombre;
  private int edad;
  private String color;
  private String sexo;
  
  Caballo (String n, int e, String c, String s) {
    this.nombre = n;
    this.edad = e;
    this.color = c;
    this.sexo = s;
  }

  public String getNombre() {
    return this.nombre;
  }
  
  public String getSexo() {
    return this.sexo;
  }
  
  public String getColor() {
    return this.color;
  }
  public int getEdad() {
    return this.edad;
  }

  public void cabalga() {
    System.out.println("Jiah jiah");
  }

  public void come() {
    System.out.println("Ñam ñam ñam");
  }
}
