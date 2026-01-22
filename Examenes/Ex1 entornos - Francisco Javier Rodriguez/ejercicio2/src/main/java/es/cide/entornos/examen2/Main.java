package es.cide.entornos.examen2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada");
        String n=sc.next().toString().toLowerCase();
        for(int i=0; i<n.length();i++){
            System.out.println(n.charAt(i));
        }

    }
}