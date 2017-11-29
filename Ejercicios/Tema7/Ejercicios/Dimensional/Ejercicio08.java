/**
 *Ejercicio 8
 *Realiza un programa que pida la temperatura media que ha hecho en cada mes
 *de un determinado año y que muestre a continuación un diagrama de barras
 *horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 *de asteriscos o cualquier otro carácter.
 */

public class Ejercicio08 {
  public static void main(String[] args) {
  
    String[] mes = new String[12]; // Los meses
                
    mes[0] = "Enero";
    mes[1] = "Febrero";
    mes[2] = "Marzo";
    mes[3] = "Abril";
    mes[4] = "Mayo";
    mes[5] = "Junio";
    mes[6] = "Julio";
    mes[7] = "Agosto";
    mes[8] = "Septiembre";
    mes[9] = "Octubre";
    mes[10] = "Noviembre";
    mes[11] = "Diciembre";
    
    
    int[] temperatura = new int[12];
    int i, j;
    
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    String rojo = "\033[31m";
          
    for (i = 0; i < 12; i++) { // Introducir la Temp. Media
      System.out.print("Introduce la temperatura media de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println();
    for (i = 0; i < 12; i++) { // Gráfica tope guapa
      System.out.printf(naranja + "%12s " + verde + "│", mes[i]);
      for (j = 0; j < temperatura[i]; j++) {
        System.out.print(morado + "▄");
      }
      System.out.println(rojo + " " + temperatura[i] + "ºC" + blanco); // Escribe los XºC
    }
  }
}
