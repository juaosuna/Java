
package Taller2delvideo20;

import java.util.Scanner;

public class punto3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Digite un numero entero: ");
        int n=myScanner.nextInt();
        //ecuacion
        int total = 0;
        for (int i =0; i<= n ; i++){
            total +=i;
        }System.out.println(String.format("La suma es %d",total));
   
    }    
}
