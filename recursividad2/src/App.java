import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numeros[] ={1, 2, 3, 4, 5} ;
        System.out.println(sumaArray(numeros, numeros.length)); 
        sc.close();
    }

    public static int sumaArray(int[] array, int n) {
        if (n == 0) {
            return 0;
        }
        return array[n - 1] + sumaArray(array, n - 1);
    }
}
