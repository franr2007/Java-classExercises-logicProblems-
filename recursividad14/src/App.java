import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez Magaña
//04-02-26

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println(numeroPequeño(i));
        sc.close();
    }
    public static int min(int a,int b){
        if (a<=b) {
            return a;
        }
        else return b;
    }


    public static int numeroPequeño(int i){
        if (i<=9) {
            return i;
        }
        else{
            return numeroPequeño(i/10)*10 +min(i%10, (numeroPequeño(i/10)%10));
        }
    }
}
