import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(agrandarNumeros(n));
        sc.close();
    }

    public static int agrandarNumeros(int n){
        if (n<10) {
            return n;
        }
        else{
            if (n%100>n%10) {
                return agrandarNumeros(n/10)+(n%100*10);
            }
            else return agrandarNumeros(n/10)+(n%10*10);
        }
    }
}
