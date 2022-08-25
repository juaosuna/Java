
package Videos24_31;

//metodo toString
//La clase se llama movieDeVideo25

public class Video30 {
    
    public static void main(String[] args) {
        //llamar a la clase 
        //aca se esta utilizando el metodo constructor
        movieDeVideo25 Vikings = new movieDeVideo25();
        movieDeVideo25 toyStory = new movieDeVideo25(" Toy Story"," Familiar",90);
        movieDeVideo25 backToTheFuture = new movieDeVideo25(" backToTheFuture"," Ciencia Ficcion",120);
        
        //utilizamos el metodo ToString
        System.out.println(backToTheFuture.toString());
        System.out.println(toyStory.toString());
    } 
    
}
