public class EjCaballo {

  public static void main(String[] args) {
    
    Caballo b = new Caballo("Blacky", 5, "negro","hembra");
    Caballo s = new Caballo("Silver", 6, "blanco", "macho");
    
    System.out.println("Hola, me llamo " + b.getNombre() + " y soy "  + b.getSexo());
    b.cabalga();
      
    System.out.println("Hola, me llamo " + s.getNombre() +", tengo " + s.getEdad() + " años y mi color es " + s.getColor());
    s.come();
  }
}
