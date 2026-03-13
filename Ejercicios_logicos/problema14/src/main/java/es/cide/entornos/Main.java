package es.cide.entornos;

import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine().toLowerCase();
        boolean notGreater = true;

        String s = "";

        while (notGreater) {
            s = sc.next();

            if (s.equals(".")) {
                notGreater = false;
            } else if (p.compareTo(s) <= 0) {
                notGreater = false;
            }

        }

        if (s.equals(p)) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}