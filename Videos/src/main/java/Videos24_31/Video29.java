
package Videos24_31;
//metodos de clases
//La clase se llama movieDeVideo25

public class Video29 {
    
    public static void main(String[] args) {
       //llamar a la clase 
        //aca se esta utilizando el metodo constructor
        movieDeVideo25 Vikings = new movieDeVideo25();
        movieDeVideo25 toyStory = new movieDeVideo25(" Toy Story"," Familiar",90);
        movieDeVideo25 backToTheFuture = new movieDeVideo25(" backToTheFuture"," Ciencia Ficcion",120);
        
        //llamando el meto desde la clase
        backToTheFuture.play();
        backToTheFuture.pausa();
        toyStory.play();
        
        int toyStoryTotalFrames = toyStory.getTotalFrames(20);
        
        System.out.println("Total de fotogramas: "+toyStoryTotalFrames);
    } 
    //se pasas los metodos play a la clase y se borran
 
}
