package es.cide.entornos7;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salir = 0;
        while (salir == 0) {
            int noRepetir = 0;
            int y = 0, x = 0;
            String posicion="";
            while (noRepetir==0) {
                System.out.println("Pon las posicion basandote en n=norte, s=sur, e=este y w=oeste");
                posicion = sc.next().toString().toLowerCase();
            if (posicion.equals(".")) {
                System.out.println("Saliendo...");
                salir++;
            }

            for (int i = 0; i < posicion.length(); i++) {
                if (posicion.charAt(i) == 'n') {
                    y++;
                } else if (posicion.charAt(i) == 's') {
                    y--;
                } else if (posicion.charAt(i) == 'e') {
                    x++;
                } else if (posicion.charAt(i) == 'w') {
                    x--;
                }
            }
            System.out.println("Estas en la posicion (" + x + "," + y + ")");
            if (noRepetir==0) {
                System.out.println("Quieres repetir con o");
            }
        }
        }
        sc.close();
    }
}