package es.cide.entornos;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean par=false;

        while (n !=0) {
            if (n%2==0) {
                n=sc.nextInt();
                par=true;
            }
        }
        if (par) {
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}