package es.cide.entornos;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int centimos=sc.nextInt();
        int p=0;
        int q=0;

        for(p=0;q<=centimos/7;q++){
            int resto= centimos-(7*p);
            if (resto%4==0) {
                q=resto/4;
            }
        }

        System.out.println("Esta es la cantidad de sellos de 7 centimos que hay: "+p);
        System.out.println("Esta es la cantidad de sellos de 4 centimos que hay: "+q);
        sc.close();
    }
}