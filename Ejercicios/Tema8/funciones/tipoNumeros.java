package funciones;
import matemáticas.*;

public class tipoNumeros {

    /**
    * Pasa un número de base decimal a base binaria
    *
    * @param numero: número que queremos pasar a binario
    * @return Devuelve el número en binario
    */
      public static int binario (int numero) {
        int binario = 0;
        int contador = 0;
        int copia = numero;
        while (numero % 2 == 0) {
          contador++;
          numero /= 2;
        }
        
        while (copia > 0) {
          
          binario = (copia % 2) + binario * 10;
          copia /= 2;
        }
        binario = Varias.voltea(binario);
        for (int i = 0; i < contador; ++i) {
          binario *= 10;
        }
        return binario;
      }
      
    /**
    * Pasa un número de base binaria a base decimal
    *
    * @param numero: número que queremos pasar a decimal
    * @return Devuelve el número en decimal.
    */
      public static int decimal (int numero) {
        int suma = 0;
        
        int copia = numero;
        int resto = 0;
        for (int i = 0; i < Varias.digitos(copia); ++i) {
          resto = numero % 10;
          
          suma += ((Varias.posicionDeDigito(2, i)) * resto);
          numero /= 10;
        }
        return suma;
      }
    /**
    * Pasa un número de base decimal a base octal
    *
    * @param numero: número que queremos pasar a octal
    * @return Devuelve el número en octal.
    */ 
      public static int octal(int numero) {
        int resto = 0;
              int octal = 0;
              while (numero > 0) {
                resto = numero % 8;
                octal = resto + (octal * 10);
                numero /= 8;
              }
              return Varias.voltea(octal);
      }
    /**
    * Pasa un número de base octal a base decimal
    *
    * @param numero: número que queremos pasar a decimal
    * @return Devuelve el número en decimal.
    */ 
      public static int octalDec (int numero) {
        int suma = 0;
        
        int copia = numero;
        int resto = 0;
        for (int i = 0; i < Varias.digitos(copia); ++i) {
          resto = numero % 10;
          
          suma += ((Varias.potencia(8, i)) * resto);
          numero /= 10;
        }
        return suma;
      }
      
    /**
    * Pasa un número de base hexadecimal a base decimal
    *
    * @param numero: número que queremos pasar a decimal
    * @return Devuelve el número en decimal.
    */ 
      public static int hexaDec (int numero) {
        int suma = 0;
        
        int copia = numero;
        int resto = 0;
        for (int i = 0; i < Varias.digitos(copia); ++i) {
          resto = numero % 10;
          
          suma += ((Varias.potencia(16, i)) * resto);
          numero /= 10;
        }
        return suma;
      }
      
    /**
    * Pasa un número de base decimal a base hexadecimal
    *
    * @param numero: número que queremos pasar a hexadecimal
    * @return Devuelve el número en hexadecimal.
    */

      public static String hexadecimal(int numero) {
        int resto = 0;
        String [] fin = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",};
        String hexadecimal = "";
        String numeroFinal = "";
        int i = 0;
        while (numero > 0) {
          resto = numero % 16;
          while (i < resto) {
            ++i;
          }
          hexadecimal += fin[i];
          numero /= 16;
          i = 0;
        }
        for (int j = hexadecimal.length() - 1; j>=0; --j) {
          numeroFinal = numeroFinal + hexadecimal.charAt(j);
        }
        return numeroFinal;
      }
}

