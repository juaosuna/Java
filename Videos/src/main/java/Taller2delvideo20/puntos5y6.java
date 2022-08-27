
package Taller2delvideo20;
public class puntos5y6 {
    
    public static void main(String[] args) {
        String [] tituloArray = new String []{"Jumanji","Toy Story","Batman: el caballero de la noche","Kill Bill"};
        
        int Maxlength = 0;
        String longestTitulo = "";
        for( String Titulo : tituloArray ){
            int titulolength = Titulo.length();
            if ( titulolength > Maxlength ){
                Maxlength = titulolength;
                longestTitulo = Titulo;
            }
        }
        //Punto 6
        int maxIndex = 0;
        int maxlength = 0;
        for( int i = 0; i < tituloArray.length; i++ ){
            String Titulo = tituloArray[i];
            int titulolength = Titulo.length();
            if ( titulolength > Maxlength ){
                maxIndex = i;
                maxlength = titulolength;
            }
        }
        System.out.println(maxIndex);
    }   
}
