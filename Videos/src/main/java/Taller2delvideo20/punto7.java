package Taller2delvideo20;
import java.util.Scanner;

public class punto7 {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inseta un numero entero mayor a 0 para obtener los numeros pares hasta dicho numero");
        int n = myScanner.nextInt();
        
        if (n <= 0){
            System.out.println("Inserta un numero pasitivo");
        }else{
            for ( int i = 1; i <= n; i++ ){
                if (i % 2 == 0)
                    System.out.println(i);
            }
        }
    }
}
