
package Video38;


public class movie extends media {
    
    private boolean premioOscar;
    
    public movie(String titulo,String genero, int duracion){
        super(titulo,genero,duracion);
    }
    
    @Override
    public int getDuracion(){
        return super.getDuracion();
    }

    public boolean isPremioOscar() {
        return premioOscar;
    }

    public void setPremioOscar(boolean premioOscar) {
        this.premioOscar = premioOscar;
    }
    
}
