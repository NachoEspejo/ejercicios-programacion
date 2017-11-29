public class EjemploArray04 {
  public static void main(String[] args) {
        
    char[] caracter = new char[6];
                
    caracter[0] = 'P';
    caracter[1] = 'U';
    caracter[2] = 'Y';
    caracter[3] = 'R';
    caracter[4] = 'C';
    caracter[5] = 'A';
    
    System.out.println("El array caracter contiene los siguientes elementos:");
    
    for (int i = 0; i < 6; i++) {
      System.out.print(caracter[i]);
    }
  }
}
