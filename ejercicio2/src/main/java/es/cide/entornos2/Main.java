package es.cide.entornos2;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int sumar;
        int restar;
        int invertir;
        int i =0;
        while (i<1) {
            System.out.println("Que quieres hacer: Sumar, Restar o Invertir. Escribe Parar para parar el programa");
            String operador = sc.next().toString();
            if (operador.equals("Sumar")) {
                System.out.println("Pon el primer numero:");
                numero1 = sc.nextInt();
                System.out.println("Ahora pon el segundo numero:");
                numero2 = sc.nextInt();
                sumar = numero1 + numero2;
                System.out.println("El resultado es: " + sumar);
            }
            else if (operador.equals("Restar")) {
                System.out.println("Pon el primer numero:");
                numero1 = sc.nextInt();
                System.out.println("Ahora pon el segundo numero:");
                numero2 = sc.nextInt();
                restar = numero1 - numero2;
                System.out.println("El resultado es: " + restar);
            }
            else if (operador.equals("Invertir")) {
                System.out.println("Pon el numero que quieres invertir:");
                numero1 = sc.nextInt();
                invertir = numero1 * -1;
                System.out.println("El numero invertido es: " + invertir);
            }
            else if (operador.equals("Parar")) {
                i++;
            }
            else {
                System.err.println("Escribe bien el operador tal cual pone en el primer texto\n");
            }
        }
        sc.close();
    }
}