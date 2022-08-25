
package video34;

public class Videos34 {
    
//metodo de herencia se esta utilizando el las clases con la funcion extends
//y aca esta llamando a la clase padre

    
    public static void main(String[] args) {
        
        movie StarWars = new movie("Star Wars","Ciencia ficcion",120);
        StarWars.setTitulo("Star Wars");
        StarWars.setGenero("Ciencia ficcion");
        StarWars.setPremioOscar(true);
        
        
        
        series StivenFuture = new series();
        StivenFuture.setTitulo("Stiven future");
        StivenFuture.setGenero("Animada");
        StivenFuture.setDuracionEpisodos(50);
        StivenFuture.setTotalEpisodios(20);
        StivenFuture.setTotalTemporadas(2);
        
        
        /*System.out.println(StarWars.toString());
        System.out.println(StivenFuture.toString());
        
        StarWars.play();
        StarWars.pausa();
        
        StivenFuture.play();*/
        
        StivenFuture.moveForward();
        
        media media1 = new media("","",120);
        String titulo = media1.getTitulo();
        String genero = media1.getGenero();
        int duracion = media1.getDuracion();
        
    }
    
}
    
