/**
 * 12. Realiza un minicuestionario con 10 preguntas tipo test sobre las
 *     asignaturas que se imparten en el curso. Cada pregunta acertada
 *     sumará un punto. El programa mostrará al final la califcación
 *     obtenida. Pásale el minicuestionario a tus compañeros y pídeles
 *     que lo hagan para ver qué tal andan de conocimientos en las
 *     diferentes asignaturas del curso.
 */
 
public class Ejercicio12 { //NO ESTA HECHO; COPIADO

  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE 1º DAW");
    
    System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
    System.out.println("a) int\nb) double\nc) float"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
    System.out.println("a) XML\nb) SELECT\nc) SQL"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println("a) href\nb) a\nc) link"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
    System.out.println("a) /etc\nb) /config\nc) /cfg"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM\nb) EPROM\nc) ROM"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("6. ¿Cuántas asignaturas te van a quedar este trimestre?");
    System.out.println("a) 1\nb) 2\nc) 0"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("7. ¿Si 3 es igual a 2, ¿cuańto es 3+6 ?");
    System.out.println("a) 0 \nb) 9\nc) 8"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("8. ¿Qué es lo primero que aprendimos en Programación?");
    System.out.println("a) Java\nb) Linux\nc) Github"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("9. ¿Cuándo tuvimos el primer examen de BBDD?");
    System.out.println("a) Lunes\nb) Miércoles\nc) Sábado"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("10. La pregunta que nunca verás en ningún examen: ");
    System.out.println("a) Esta es correcta\nb) Esta no es correcta\nc) Vuelve al apartado a)"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
