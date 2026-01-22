package es.cide.entornos;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean buscarNum = false;
        int d = sc.nextInt();
        int n = sc.nextInt();
        while (n>0) {
            if (d == n % 10) {
                buscarNum = true;
            }
            n = n / 10;
        }
        if (buscarNum == false) {
            System.out.println("NO");
        }else{
            System.out.println("SI");
        }
        sc.close();
    }
}