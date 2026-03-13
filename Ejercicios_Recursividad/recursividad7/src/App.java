import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez Magaña
//28-01-26

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculador de 7's: pon numeros:");
        int n=sc.nextInt();
        System.out.println("Tienes "+contadorSietes(n)+" sietes");
        sc.close();
    }
    public static int contadorSietes(int n){
        if (n==0) {
            return 0;
        }
        if (n%10!=7) {
            return contadorSietes(n/10);
        }
        else{
            return contadorSietes(n/10)+1;
        }
    }
}
