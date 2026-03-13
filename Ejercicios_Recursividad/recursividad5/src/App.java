
//41663903R
//Francisco Javier Rodriguez
//21-01-26

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        if (numerosOrdenados(sc.nextInt())) {
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
    }

    public static boolean numerosOrdenados(int numero) {
        if (numero<10) {
            return true;
        }
        else{
            if ((numero%10)>=(numero/10)%10) {
                return numerosOrdenados((numero/10)%10);
            }
            else{
                return false;
            }
        }
        
    }
}
