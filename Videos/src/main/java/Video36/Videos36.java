
package Video36;


public class Videos36 {
    
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
        
        
        /*System.out.println(backToTheFuture.toString());
        System.out.println(Vikings.toString());
        
        backToTheFuture.play();
        backToTheFuture.pausa();
        
        Vikings.play();*/
        
        //Vikings.moveForward();
        
        media media1 = new media("","",120);
        String titulo = media1.getTitulo();
        String genero = media1.getGenero();
        int duracion = media1.getDuracion();
        
        //media1.moveForward(15);
        System.out.println(backToTheFuture.getDuracion());
        System.out.println(Vikings.getDuracion());
    }
    
}
    
