package es.cide.entornos;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sequencia = sc.next();
        int c = 0; // Parentesis (
        int d = 0; // Parentesis )


        for (int i = 0; i < sequencia.length(); i++) {
            char n = sequencia.charAt(i);
            char m = sequencia.charAt(0);
            if (m == ')') {
                System.out.println("NO");
            }
            m = sequencia.charAt(sequencia.length() - 1);
            if (m == '(') {
                System.out.println("NO");
            }
            if (n == '(') {
                c++;
            } else if (n == ')') {
                d++;
            }
        }
        if (c == d) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}