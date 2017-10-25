/**
 *Ejercicio 30
 *Realiza una programa que calcule las horas transcurridas entre dos horas de
 *dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 *El día de la semana se puede pedir como un número (del 1 al 7) o como una
 *cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 *los datos correctamente y que el segundo día es posterior al primero.
 *
 *Ejemplo:
 *Por favor, introduzca la primera hora.
 *Día: lunes
 *Hora: 18
 *Por favor, introduzca la segunda hora.
 *Día: martes
 *Hora: 20
 *Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 */
 
 public class Ejercicio30 {

  public static void main(String[] args) {

    int primerDia = 0;
    int primeraHora;
    int segundoDia = 0;
    int segundaHora;
    String primerDiaString;
    String segundoDiaString;
    String nombrePrimerDia = "";
    String nombreSegundoDia = "";
    boolean datosCorrectos = true;
    
    System.out.println("Calculadora de diferencia horaria entre dias");
    do { 
      //Inicio del primer dia
      System.out.println();
      System.out.println("Datos de primer día.");
      System.out.print("Día: ");
      primerDiaString = System.console().readLine();
      System.out.print("Hora: ");
      primeraHora = Integer.parseInt(System.console().readLine());
      
      switch(primerDiaString){
        case "lunes":
        case "1":
          primerDia = 1;
          nombrePrimerDia = "lunes";
          break;
          
        case "martes":
        case "2":
          primerDia = 2;
          nombrePrimerDia = "martes";
          break;
          
        case "miercoles":
        case "3":
          primerDia = 3;
          nombrePrimerDia = "miercoles";
          break;
          
        case "jueves":
        case "4":
          primerDia = 4;
          nombrePrimerDia = "jueves";
          break;
          
        case "viernes":
        case "5":
          primerDia = 5;
          nombrePrimerDia = "viernes";
          break;
          
        case "sabado":
        case "6":
          primerDia = 6;
          nombrePrimerDia = "sabadp";
          break;
          
        case "domingo":
        case "7":
          primerDia = 7;
          nombrePrimerDia = "domingo";
          break;
      
        default:
          primerDia = 0;
        //Fin del primer dia
        }
        //Inicio del segundo dia
      System.out.println();
      System.out.println("Datos del segundo día.");
      System.out.print("Día: ");
      segundoDiaString = System.console().readLine();
      System.out.print("Hora: ");
      segundaHora = Integer.parseInt(System.console().readLine());
      
      switch(segundoDiaString) {
        case "lunes":
        case "1":
          segundoDia = 1;
          nombreSegundoDia = "lunes";
          break;
          
        case "martes":
        case "2":
          segundoDia = 2;
          nombreSegundoDia = "martes";
          break;
          
        case "miercoles":
        case "3":
          segundoDia = 3;
          nombreSegundoDia = "miercoles";
          break;
          
        case "jueves":
        case "4":
          segundoDia = 4;
          nombreSegundoDia = "jueves";
          break;
          
        case "viernes":
        case "5":
          segundoDia = 5;
          nombreSegundoDia = "viernes";
          break;
          
        case "sabado":
        case "6":
          segundoDia = 6;
          nombreSegundoDia = "sabado";
          break;
          
        case "domingo":
        case "7":
          segundoDia = 7;
          nombreSegundoDia = "domingo";
          break;
          
        default:
          segundoDia = 0;
          //Fin del segundo dia
      }
          //Comprobacion semanal
        datosCorrectos = true;
      
      if (segundoDia <= primerDia) {
        System.out.println();
        System.out.println("El segundo día debe ser posterior al primer día.");
        datosCorrectos = false;
      }
      
      if ((primerDia == 0) || (segundoDia == 0)) {
        System.out.println();
        System.out.println("Ese día de la semana no existe.");
        System.out.println("Los días válidos son: lunes, martes, miércoles, jueves, viernes, sabado, domingo.");
        datosCorrectos = false;
      }
      
      if ((primeraHora < 0) || (primeraHora > 23) || (segundaHora < 0) || (segundaHora > 23)) {
        System.out.println();
        System.out.println("El horario humano se compone de 24h, a no ser que seas alienígena.");
        System.out.println("Las horas válidas están entre 0 y 23.");
        datosCorrectos = false;
      }
      
    } while (!datosCorrectos);
    // Fin de la comprobacion semanal 
    
    System.out.println();
    System.out.print("Entre las " + primeraHora + ":00h del primer día que es el  " + nombrePrimerDia);
    System.out.print(" y las " + segundaHora + ":00h del segundo día que es el " + nombreSegundoDia);
    System.out.println(" hay una diferencia de " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " horas.");

        
        
  }
}

 
 
 
