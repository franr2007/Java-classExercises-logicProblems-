package es.cide.entornos.examen2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada");
        String s=sc.next();

        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }

        sc.close();
    }
}