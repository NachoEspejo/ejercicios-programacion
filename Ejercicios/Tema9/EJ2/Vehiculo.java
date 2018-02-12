public abstract class Vehiculo {
  
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;
  
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
