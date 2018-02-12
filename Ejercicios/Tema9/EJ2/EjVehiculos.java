public class EjVehiculos {

  public static void main(String[] args) {

    int opcion = 0;
    
    Bicicleta theBike = new Bicicleta();
    Coche lambo = new Coche();

    while (opcion != 9) {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Vehiculos creados");
      System.out.println("9. Salir");
      System.out.println("Elige una opción (1-9): ");
      
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          theBike.recorre(Integer.parseInt(System.console().readLine()));
          break;
        case 2:
          theBike.elCaballito();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          lambo.recorre(Integer.parseInt(System.console().readLine()));
          break;
        case 4:
          lambo.quemaRueda();
          break;
        case 5:
          System.out.println("La bicicleta lleva recorridos ");
          System.out.println(theBike.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.println("El coche lleva recorridos ");
          System.out.println(lambo.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.println("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
          break;
        case 8:
          System.out.println("Se han creado un total de ");
          System.out.println(Vehiculo.getvehiculosCreados() + " vehiculos");
          break;
        default:
      }
      System.out.println();
    }
  }
}
