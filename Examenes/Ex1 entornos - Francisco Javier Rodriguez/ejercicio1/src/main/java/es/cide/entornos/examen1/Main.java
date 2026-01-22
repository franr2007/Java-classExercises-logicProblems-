//Francisco Javier Rodriguez
//29-10-25
package es.cide.entornos.examen1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada");
        int n = sc.nextInt();
        int j = 0;
        while (j == 0) {
            if (n <= 0) {
                System.out.println("Tiene que ser un numero positivo o > que 0");
                n = sc.nextInt();
            } else {
                j++;
            }
        }
        int suma = 0;
        for (int i = 1; i < n; i++) {
            suma = suma + i;
            if (suma == n) {
                i = n;
            }
        }
        if (suma == n) {
            System.out.println(n + " es perfecto");
        } else {
            System.out.println(n + " no es perfecto");
        }
        sc.close();
    }
}