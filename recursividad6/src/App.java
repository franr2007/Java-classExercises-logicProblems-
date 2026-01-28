import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez Magaña
//29-01-26

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuntos conejos tienes??");
        int n=sc.nextInt();
        System.out.println("El conejo tiene: "+orejasConejos(n));
        sc.close();
    }

    public static int orejasConejos(int n){
        if (n==0) {
            return 0;
        }
        if (n%2==0) {
            return orejasConejos(n-1)+3;
        }
        else{
            return orejasConejos(n-1)+2;
        }
    }
}
