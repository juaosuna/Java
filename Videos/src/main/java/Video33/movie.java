
package Video33;


public class movie extends media {
    
    boolean premioOscar;
    
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
