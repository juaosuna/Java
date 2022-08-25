
package Video35;


public class movie extends media {
    
    private boolean premioOscar;
    
    public movie(String titulo,String genero, int duracion){
        super(titulo,genero,duracion);
    }

    public boolean isPremioOscar() {
        return premioOscar;
    }

    public void setPremioOscar(boolean premioOscar) {
        this.premioOscar = premioOscar;
    }
    
}
