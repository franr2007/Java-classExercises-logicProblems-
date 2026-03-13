import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez Magaña
//30-01-26

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pon un numero: ");
        int a=sc.nextInt();
        System.out.println("Pon un numero que quieras elevarle al numero anterior");
        int n=sc.nextInt();
        System.out.println(elevado(a, n));
        sc.close();
    }

    public static int elevado(int a, int n){
        if (n==1) {
            return a;
        }
        else{
            return a*elevado(a, n-1);
        }
    }
}
