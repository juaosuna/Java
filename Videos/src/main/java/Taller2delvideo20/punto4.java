
package Taller2delvideo20;

import java.util.Scanner;

public class punto4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("¿Como esta el clima el dia de hoy?");
        int weather = myScanner.nextInt();
        switch (weather) {
            case 1:
                System.out.println("El clima es soleado");
                break;
            case 2:
                System.out.println("El clima es nubado");
                break;
            case 3:
                System.out.println("El clima es lluvioso");
                break;
            case 4:
                System.out.println("el clima es tormentoso");
                break;
            case 5:
                System.out.println("El clima es nevado");
                break;
            default:
                System.out.println("Preguntale a Google");
        }
    }   
}
