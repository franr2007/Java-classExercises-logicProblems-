//Francisco Javier Rodriguez
//29-10-25
package es.cide.entornos.examen1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada");
        int n = sc.nextInt();
        int suma=0;
        
        for(int i=1; i<n;i++){
            if (n%i==0) {
                suma+=i;
            }
        }

        if (suma==n) {
            System.out.println("es perfecto");
        }
        else{
            System.out.println("no es perfecto");
        }
        
        sc.close();
    }
}