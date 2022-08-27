
package Videos24_31;

import java.util.Random;

//Con el video anterior ahora este vamos a utilizar multiples constructores
//La clase se llama movieDeVideo25

public class Video28 {
    
   public static void main(String[] args) {
       //llamar a la clase 
        //aca se esta utilizando el metodo constructor
        movieDeVideo25 Vikings = new movieDeVideo25();
        movieDeVideo25 toyStory = new movieDeVideo25(" Toy Story"," Familiar",90);
        movieDeVideo25 backToTheFuture = new movieDeVideo25(" backToTheFuture"," Ciencia Ficcion",120);
        
        System.out.println(backToTheFuture.getTitulo()+ " " + backToTheFuture.getGenero()+" "+ backToTheFuture.getDuracion() );
        System.out.println(toyStory.getTitulo()+ " " + toyStory.getGenero()+" "+ toyStory.getDuracion() );
        System.out.println(toyStory.getTitulo()+ " " + toyStory.getGenero()+" "+ toyStory.getDuracion());
        
        movieDeVideo25 madMax = new movieDeVideo25(" MadMax furia en el camino"," Accion",90);
        
        
    }    
    public static String play(String[] tituloArray, int index){
        if (index < tituloArray.length ) { 
            String titulo = tituloArray [index];
            
            for (int i = 0; i < 10; i++){
                System.out.println("Rodando la pelicula"+titulo);
            }
            return titulo;
        }else{
            System.out.println("indice muy grande");
            return "";
        }
    }
    //metodo sobre cargado
    public static String play(String[] tituloArray) {
     Random random = new Random();
     int index = random.nextInt(tituloArray.length - 1);
     
     String titulo = tituloArray [index];
           
        for (int i = 0; i < 10; i++){
            System.out.println("Rodando la pelicula"+titulo);    
        }
        return titulo;    
    }
    
    public static void pausa(String titulo) {
        if (titulo.isEmpty()){
            System.out.println("Pelicula no reproduce");
        }else{
            System.out.println("Pelicula pausada"+titulo);
        } 
    }
    
}
