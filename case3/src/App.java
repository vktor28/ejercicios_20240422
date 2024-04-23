import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //3- Premio vacaciones en Ibiza: tienes un listado de
       //nombres en un array. Aleatoriamente, seleccionar el ganador
       //y mostrarlo. Entonces preguntar: "otra vez? (S/N)",
       //y si es que sí, volver a generar nuevo ganador y mostrarlo. Seguir preguntando hasta que el usuario diga que no.

       String[] nombres = {"Paco","Eira","Manuela","Alfonso"}; 
       String respuesta ="N";
        do {
            Scanner teclado = new Scanner(System.in);
            Random random = new Random(); 
            int randomIndex = random.nextInt(nombres.length); 
            String randomString = nombres[randomIndex]; 
            System.out.println("El ganador es: " + randomString);
            System.out.println("otra vez? (S/N)");
            respuesta=teclado.nextLine();
            teclado.close();
        
        } while(respuesta.equals("S"));
        System.out.println("FIN");

        
    }
    }