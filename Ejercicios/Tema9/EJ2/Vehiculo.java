public abstract class Vehiculo {
  
  // atributos de clase
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;
  
  // atributos de instancia
  private int kilometrosRecorridos;
  
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
    Vehiculo.vehiculosCreados++;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
  
  public static int getvehiculosCreados() {
    return Vehiculo.vehiculosCreados;
  }
  
  /**
   * AUMENTA LOS KM's RECORRIDOS
   */  
  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
}
