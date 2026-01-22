package es.cide.entornos9;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon dos numeros naturales");
        System.out.println("Pon el primer numero");
        int a = sc.nextInt();
        System.out.println("Pon el segundo numero");
        int b = sc.nextInt();
        while (a < 0 || b < 0) {
            System.out.println("Solo numero positivos, pon los dos numeros otra vez");
            System.out.println("Pon el primer numero");
            a = sc.nextInt();
            System.out.println("Pon el segundo numero");
            b = sc.nextInt();
        }
        int numerosRestantes=0;
        if (a<b) {
            numerosRestantes=b-a;
            for(int i=1;i<numerosRestantes;i++){
                System.out.println("Los numeros entre el primer numero y el segundo son:");
                System.out.println(a+i);
            }
        }else if (a==b) {
            System.out.println("Los numeros son iguales");
            System.out.println(a);
        }
        else;
        sc.close();
    }
}