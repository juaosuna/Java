
package Video32;

public class Videos32 {
    
// utilizaremos la funcion extends
//y aca esta llamando a la clase padre    
    public static void main(String[] args) {
        
        movie backToTheFuture = new movie();
        backToTheFuture.setTitulo("backToTheFuture");
        backToTheFuture.setGenero("Ciencia ficcion");
        backToTheFuture.setPremioOscar(true);
                
        series Vikings = new series();
        Vikings.setTitulo("Vikings");
        Vikings.setGenero("aventura");
        Vikings.setDuracionEpisodos(50);
        Vikings.setTotalEpisodios(10);
        Vikings.setTotalTemporadas(6);
        
        System.out.println(backToTheFuture.toString());
        System.out.println(Vikings.toString());
        
        backToTheFuture.play();
        backToTheFuture.pausa(); 
        backToTheFuture.play();   
    }
    
}
    
