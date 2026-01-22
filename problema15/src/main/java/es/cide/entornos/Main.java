package es.cide.entornos;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        String frase = sc.next();

        int actual = 0;
        int maximo = 0;
        boolean bucle = true;

        while (bucle) {
                if (frase.equals(".")) {
                    bucle = false;
                } else {
                    frase = sc.next();
                }
            if (frase.equals(palabra)) {
                actual++;
                if (actual>maximo) {
                    maximo=actual;
                }
            }
            else{
                actual=0;
            }
        }
        System.out.println(maximo);
        sc.close();
    }
}