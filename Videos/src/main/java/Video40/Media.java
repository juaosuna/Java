
package Video40;
//clase padre


public class Media {
    
    private String titulo;
    private String genero;
    private int duracion;
    private String synopsis;
    private String contenido = "";

    public Media(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void play(){
        printSomething("Reproducir "+titulo);
    }
    public void pausa(){
        printSomething("Pausar "+titulo);
    }
    
    private void printSomething( String something ){
        System.out.println(something);
    }
    
    public void moveForward(int minutos){
        printSomething("Adelantar "+ minutos+ "minutos");
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    

    @Override
    public String toString() {
        return "media titulo es " + titulo + ", genero " + genero + ", duracion " + duracion;
    }
    
    
    
}
