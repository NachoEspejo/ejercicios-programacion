/**
 *Ejercicio 21
 *Realiza un programa que genere una secuencia de cinco monedas de curso
 *legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 *5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 *posiciones posibles son cara y cruz
 */
 
public class Ejercicio21 {

  public static void main(String[] args) {

    int moneda;
    String monedaTipo = "";
    int resultado;
    String caraCruz = "";
    
    for(int i = 1; i <= 5; i++) {
      moneda = (int)(Math.random() * 8) + 1;
      resultado = (int)(Math.random() * 2) + 1;
      switch(moneda) {
        case 1:
          monedaTipo = "0.01 €";
          break;
        case 2:
          monedaTipo = "0.02 €";
          break;
        case 3:
          monedaTipo = "0.05 €";
          break;
        case 4:
          monedaTipo = "0.10 €";
          break;
        case 5:
          monedaTipo = "0.20 €";
          break;
        case 6:
          monedaTipo = "0.50 €";
          break;
        case 7:
          monedaTipo = "1 €";
          break;
        case 8:
          monedaTipo = "2 €";
          break;
        default:
      }
      switch(resultado) {
        case 1:
          caraCruz = "😶 ";
          break;
        case 2:
          caraCruz = "✝ ";
          break;
        default:
      }
      System.out.println("La moneda " + i + " es un " + monedaTipo + " que ha salido " + caraCruz);
    }
  }
}
