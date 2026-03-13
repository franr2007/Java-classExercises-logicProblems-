package es.cide.entornos4;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero=sc.nextInt();
        numero=Math.abs(numero);
        int i=0;
        while (numero>0) {
            numero=numero/10;
            i++;
        }
        System.out.println("La cantidad de digitos dentro de tu numero es: "+i);
        sc.close();
    }
}