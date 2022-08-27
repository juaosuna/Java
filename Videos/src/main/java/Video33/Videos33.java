
package Video33;


public class Videos33 {
    
//metodo de herencia con la funcion extends
    public static void main(String[] args) {
        
        movie backToTheFuture = new movie("Star Wars","Ciencia ficcion",120);
        backToTheFuture.setTitulo("Star Wars");
        backToTheFuture.setGenero("Ciencia ficcion");
        backToTheFuture.setPremioOscar(true);

        series Vikings = new series();
        Vikings.setTitulo("Vikings");
        Vikings.setGenero("Aventura");
        Vikings.setDuracionEpisodos(50);
        Vikings.setTotalEpisodios(10);
        Vikings.setTotalTemporadas(6);
        
        Vikings.Avanzar();
        
    }
    
}
    
