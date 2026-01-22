package es.cide.entornos;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner main= new Scanner(System.in);
        System.out.print("Introduce el primer nombre:");
        String a= main.next();
        System.out.print("Introduce el segundo nombre:");
        String b= main.next();

        if (a.compareTo(b)<0) {
            System.out.println(a+">"+b);
        }
        else if (a.compareTo(b)>0){
            System.out.println(a+"<"+b);
        }
        else {
            System.out.println(a+"="+b);
        }
        main.close();
    }
}