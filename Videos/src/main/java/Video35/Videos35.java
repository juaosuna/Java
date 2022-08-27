
package Video35;

public class Videos35 {
    
//metodo de herencia se esta utilizando el las clases con la funcion extends
//y aca se esta llamando a la clase padre

    
    public static void main(String[] args) {
        
        movie backToTheFuture = new movie("Star Wars","Ciencia ficcion",120);
        backToTheFuture.setTitulo("Star Wars");
        backToTheFuture.setGenero("Ciencia ficcion");
        backToTheFuture.setPremioOscar(true);
                
        series Vikings = new series();
        Vikings.setTitulo("Stiven future");
        Vikings.setGenero("Animada");
        Vikings.setDuracionEpisodos(50);
        Vikings.setTotalEpisodios(20);
        Vikings.setTotalTemporadas(2);
        
        
        /*System.out.println(StarWars.toString());
        System.out.println(StivenFuture.toString());
        
        backToTheFuture.play();
        backToTheFuture.pausa();
        
        Vikings.play();*/
        
        Vikings.Avanzar();
        media media1 = new media("","",120);
        String titulo = media1.getTitulo();
        String genero = media1.getGenero();
        int duracion = media1.getDuracion();
        
        media1.Avanzar(15);
        
    }
    
}
    
