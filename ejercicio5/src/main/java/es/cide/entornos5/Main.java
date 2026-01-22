package es.cide.entornos5;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe algo y termina con punto");
        String texto = sc.next().toString().toLowerCase();
        int sumaA = 0;
        for (int i = 0; i < texto.length(); i++) {
            int j=0;
            while (j < texto.length()) {
                if (texto.length()=='.') {
                    j=texto.length();
                }else{
                    System.out.println("Pon un punto al final de tu frase o palabra, escribela otra vez");
                    texto = sc.next().toString().toLowerCase();
                }
            }
            if (texto.charAt(i) == 'a') {
                sumaA += 1;
            }
        }
        ;
        System.out.println("El numero de a son: " + sumaA);
        sc.close();
    }
}