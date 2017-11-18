/**
 *Ejercicio 18
 *Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 *sustituir el color blanco por colores más alegres. Realiza un programa que
 *genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 *cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 *que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 *violeta y naranja.
 */
 
public class Ejercicio18 {

  public static void main(String[] args) {

  
    int color1;
    int color2;
    int color3;
    String fuenteColor1 = "";
    String fuenteColor2 = "";
    String fuenteColor3 = "";

    do {
      color1 = (int)(Math.random() * 6);
      color2 = (int)(Math.random() * 6);
      color3 = (int)(Math.random() * 6);
    } while ((color1 == color2) || (color1 == color3) || (color2 == color3));


    
    switch(color1) {
      case 0:
        fuenteColor1 = "rojo";
        break;
      case 1:
        fuenteColor1 = "azul";
        break;
      case 2:
        fuenteColor1 = "verde";
        break;
      case 3:
        fuenteColor1 = "amarillo";
        break;
      case 4:
        fuenteColor1 = "violeta";
        break;
      case 5:
        fuenteColor1 = "naranja";
        break;
      default:
    }    
    switch(color2) {
      case 0:
        fuenteColor2 = "rojo";
        break;
      case 1:
        fuenteColor2 = "azul";
        break;
      case 2:
        fuenteColor2 = "verde";
        break;
      case 3:
        fuenteColor2 = "amarillo";
        break;
      case 4:
        fuenteColor2 = "violeta";
        break;
      case 5:
        fuenteColor2 = "naranja";
        break;
      default:
    }
    switch(color3) {
      case 0:
        fuenteColor3 = "rojo";
        break;
      case 1:
        fuenteColor3 = "azul";
        break;
      case 2:
        fuenteColor3 = "verde";
        break;
      case 3:
        fuenteColor3 = "amarillo";
        break;
      case 4:
        fuenteColor3 = "violeta";
        break;
      case 5:
        fuenteColor3 = "naranja";
        break;
      default:
    }

    System.out.println("Dormitorio 1 va a ser de color: " +fuenteColor1);
    System.out.println("Dormitorio 2 va a ser de color: " +fuenteColor2);
    System.out.println("Dormitorio 3 va a ser de color: " +fuenteColor3);
  }
}
