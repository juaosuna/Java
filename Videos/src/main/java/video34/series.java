
package video34;

import java.util.Scanner;

public class series extends media {
    
    int totalEpisodios;
    int totalTemporadas;
    int duracionEpisodos;
    
    public series(String titulo,String genero, int duracion,int totalEpisodios,int totalTemporadas){
        super(titulo,genero,duracion);
        this.totalEpisodios = totalEpisodios;
        this.totalTemporadas = totalTemporadas;   
    }
    
    public series(){
        super ("","",0);
        totalEpisodios = 0;
        totalTemporadas = 0;
        duracionEpisodos = 0;
    }

    public int getTotalEpisodios() {
        return totalEpisodios;
    }

    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }

    public int getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(int totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public int getDuracionEpisodos() {
        return duracionEpisodos;
    }

    public void setDuracionEpisodos(int duracionEpisodos) {
        this.duracionEpisodos = duracionEpisodos;
    }
    
    public void moveForward(){
        System.out.println("Quieres avanzar muchos minutos");
        Scanner scanner = new Scanner(System.in);
        int minutos = scanner.nextInt();
        super.moveForward(minutos);
    }
}
