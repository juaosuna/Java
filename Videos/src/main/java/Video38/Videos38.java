
package Video38;

import java.util.Scanner;

public class Videos38 {//Astraccion    
    public static void main(String[] args) {
        
        movie backToTheFuture = new movie("Back To The Future","Ciencia ficcion",120);
        backToTheFuture.setPremioOscar(true);
        backToTheFuture.descargas();
        
        series breakingBad = new series("Breaking Bad", "Drama y drogas",50,12,5);
        series Vikings = new series("Vikings","Accion y aventura",50,10,6);
        series Friends = new series("Friends","comedia",20,22,12);
        
        breakingBad.setSynopsis("Un profe recluta a un vago y vende dulces azules");
        Vikings.setSynopsis("Un monton de rudos van y buscan pleito a otros paises nada mas porque si");
        Friends.setSynopsis("Un grupo de amigos que al parecer no trabajan ni tienen hobbies se juntan a hablar de parejas");
        
        printInstrucciones();
        
        Scanner scanner = new Scanner(System.in);
        int seleccion = scanner.nextInt();
        
        while (seleccion != 0) {
            System.out.println("\n");
            
            if (seleccion ==1 ) {
                System.out.println(breakingBad.getSynopsis());
            }else if(seleccion ==2) {
                System.out.println(Vikings.getSynopsis());
            }else if(seleccion ==3) {
                System.out.println(Friends.getSynopsis());
            }else{
                System.out.println("Serie invalida, selecione otra");
            }
            System.out.println("\n");
            printInstrucciones();
            seleccion = scanner.nextInt();
        }
        System.out.println("Fin");
    }
    private static void printInstrucciones(){
        System.out.println("Selecione una serie para ver su sinopsis ");
        System.out.println("1) - Breaking Bad");
        System.out.println("2) - Vikings");
        System.out.println("3) - Friends");
        System.out.println("0) - Salir");
    }
}
    
