
package Videos24_31;

//metodos y variables staticas
//La clase se llama movieDeVideo25

public class Video31 {
    
    public static void main(String[] args) {
        //llamar a la clase 
        //aca se esta utilizando el metodo constructor
        movieDeVideo25 Vikings = new movieDeVideo25();
        movieDeVideo25 toyStory = new movieDeVideo25(" Toy Story"," Familiar",90);
        movieDeVideo25 backToTheFuture = new movieDeVideo25(" backToTheFuture"," Ciencia Ficcion",120);
        
        //metodo estatico
        int totalFrames = movieDeVideo25.getTotalFrames(90);
        System.out.println(totalFrames);
        
        int frameResolution = movieDeVideo25.FRAME_RESOLUTION;
    }
    
}
