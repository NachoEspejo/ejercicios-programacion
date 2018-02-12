public class ExpoCampa {
  public static void main(String[] args) {
    
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    
    int opcion = 0;
    int eleccionZona = 0;
    int entradas = 0;
    
    do {
      System.out.println("✪ ✪ EXPOCOCHES CAMPANILLAS ✪ ✪");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Comprar entradas");
      System.out.println("3. Salir");
      System.out.println("Elige una opción: ");
      
      opcion = Integer.parseInt(System.console().readLine());
      System.out.println();
      
      if (opcion == 1) {
        System.out.println("En la zona principal hay: " + principal.getEntradasPorVender() + " disponibles.");
        System.out.println("En la zona de compra venta hay: " + compraVenta.getEntradasPorVender() + " disponibles.");
        System.out.println("En la zona VIP hay:: " + vip.getEntradasPorVender() + " disponibles.");
        System.out.println();
      }
      
      if (opcion == 2) {
        System.out.println("1. Principal");
        System.out.println("2. Compra-Venta");
        System.out.println("3. VIP");
        System.out.print("Elige la zona para la que quieres comprar las entradas: ");
        
        eleccionZona = Integer.parseInt(System.console().readLine());
        
        System.out.print("¿Cuántas entradas quieres? ");
        entradas = Integer.parseInt(System.console().readLine());
        
        switch (eleccionZona) {
          case 1:
            principal.vender(entradas);
            break;
          case 2:
            compraVenta.vender(entradas);
            break;
          case 3:
            vip.vender(entradas);
            break;
          default:
        }
      }
      
      if (opcion >= 4) {
        System.out.println("Mnnn me haces cuestionar tu inteligencia");
      }
      
    } while (opcion < 3); 
  }
}
