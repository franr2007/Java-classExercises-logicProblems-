package es.cide.entornos3;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Elije el primer numero para ser multiplicado");
    int x=sc.nextInt();
    System.out.println("Elije el segundo numero que multiplicara al primero");
    int y=sc.nextInt();
    int contador=1;
    int resultado=0;
    while (contador<=y) {
        resultado=resultado+x;
        contador++;
    }
    System.out.println("El resultado de la multiplicacion es: "+resultado);
    sc.close();
    }
}