import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class App {
    public static int fibonacci(int n){
            if (n==0) {
                return 0;
            }
            else if (n==1) {
                return 1;
            }
            else{
                return fibonacci(n-1)+fibonacci(n-2);
            }
        };
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("El fibonacci de: "+n+" es "+fibonacci(n));
    }
}
