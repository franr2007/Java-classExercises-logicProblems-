package es.cide.entornos8;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas figuras geometricas quieres calcular");
        int numeroFiguras = sc.nextInt();
        while (numeroFiguras<0) {
            System.out.println("Pon un numero positivo");
            numeroFiguras=sc.nextInt();
        }
        int altura;
        int base;
        int areaR;
        int radio;
        double pi = 3.14;
        double areaC;
        for (int i = 0; i < numeroFiguras; i++) {
            System.out.println(
                    "Selecciona la figuar si es rectangulo pulsa (1), si es circula pulsa (2), pulsa (0) para salir");
            int figura = sc.nextInt();
            int numFueraRango = 0;
            while (numFueraRango == 0) {
                if (figura > 2 || figura < 0) {
                    System.out.println("Pon un numero valido, 0,1 o 2");
                    figura = sc.nextInt();
                } else {
                    numFueraRango++;
                }
            }
            if (figura == 0) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else if (figura == 1) {
                System.out.println("Ponle valor a la altura");
                altura = sc.nextInt();
                System.out.println("Ponle valor a la base");
                base = sc.nextInt();
                areaR = altura * base;
                System.out.println(areaR);
            } else if (figura == 2) {
                System.out.println("Ponle valor al radio");
                radio = sc.nextInt();
                areaC = (radio * radio) * pi;
                System.out.println(areaC);
            }

        }
        sc.close();
    }
}