import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int siguiente=0;
        boolean primEncontrado=false;
        while (sc.hasNextInt()) {
            int num=sc.nextInt();
            if (num%2!=0 || siguiente%3!=0) { //es primo?
                siguiente=num+1;
                while (!primEncontrado) {
                    if (siguiente%2!=0 || siguiente%3!=0) {
                        primEncontrado=true;
                    }
                    siguiente++;
                }
                System.out.print(siguiente+" ");
                
                primEncontrado=false;
                siguiente=0;
            }
        }
        System.out.println();

        sc.close();
    }
}
