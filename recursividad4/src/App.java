import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int respuesta=sc.nextInt();
        System.out.println(reduction_of_digits(respuesta));
        sc.close();
    }

    public static int reduction_of_digits(int x) {
        if (x<10) {
            return x;
        }
        else{
            return reduction_of_digits((x/10)+(x%10));
        }
    }
}
