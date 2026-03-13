import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int resposta=0;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n%2==0) {
                resposta+=n;
            }
            else{
                resposta-=n;
            }
        }
        System.out.println(resposta);
        sc.close();
    }
}
