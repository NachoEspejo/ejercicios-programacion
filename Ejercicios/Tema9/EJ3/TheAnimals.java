public class TheAnimals {

  public static void main(String[] args) {
   
    Perro fernin = new Perro();
    fernin.duerme();
    fernin.cuidaCrias();
    fernin.ladra();
    fernin.dameLaPata();
    System.out.println();
    
    Gato Pocho = new Gato(Sexo.MACHO, "desconocida");
    Gato Pochi = new Gato(Sexo.HEMBRA, "desconocida");
    Gato Wiscash = new Gato (Sexo.MACHO, "persa");
    Pochi.maulla();
    Pocho.cazaRatones();
    Pochi.come("pescado");
    Wiscash.peleaCon(Pochi);
    Pocho.peleaCon(Wiscash);
    System.out.println();
    
    
    Ave Pidgeota = new Ave();
    Ave Pidgeot = new Ave(Sexo.MACHO);
    Pidgeot.vuelaVuela();
    Pidgeot.poneHuevos();
    Pidgeota.poneHuevos();
    System.out.println();
    
    
    Pinguino Prinplu = new Pinguino();
    Prinplu.Linux();
    Prinplu.vuelaVuela();
    Prinplu.nadar();
    
    
    


  }
}
