package funciones;
import matemáticas.*;

public class Palotes {

  public static String convierteEnPalotes(int n) {
      String palotes = "";
      n = Varias.voltea(n);
      int resto = 0;
      while (n > 0) {
        resto = n % 10;
        for (int i = 0; i < resto; i++) {
          palotes += "|";
        }
        n /= 10;
        palotes += "-";
      }
      palotes = palotes.substring(0, palotes.length() - 1);
      return palotes;
  }
}
