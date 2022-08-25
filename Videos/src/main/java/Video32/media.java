
package Video32;

//clase padre
public class media {
    
    String titulo;
    String genero;
    int duracion;

    
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
        System.out.println("Reproducir "+titulo);
    }
    public void pausa(){
        System.out.println("Pausar "+titulo);
    }

    @Override
    public String toString() {
        return "media titulo es " + titulo + ", genero " + genero + ", duracion " + duracion;
    }
    
    
    
}
