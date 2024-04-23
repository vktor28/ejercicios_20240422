import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         //1 - Crear un array de lo que desees, pero con el tamaño
        //que diga el usuario. Luego añadir elementos hasta que
        //se rellene. Luego mostrarlo.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica cuantos números preferidos quieres almacenar");
        int numeroItems = teclado.nextInt();
        teclado.nextLine();
        String[] coches = new String[numeroItems];
        System.out.println("\nIndica cada una de ellas:");
        for(int i = 0; i <  numeroItems; i++){
            
            coches[i]=teclado.nextLine();
           
        }
    System.out.println("\nTus marcas preferidas son:"); 
    for(String preferidos : coches){
            
            System.out.print(preferidos+", "); 
            
        }
    System.out.print(" ");



        
    }
}
