import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez Magaña
//29-01-26

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Contador de 8, pero si hay otro ocho seguido contara +2 despues de uno, ejemplo 8(+1),8(+2),8(+2)");
        int n=sc.nextInt();
        System.out.println("Tienes "+contadorOchos(n)+" ochos");
        sc.close();
    }
    public static int contadorOchos(int n){
        if (n==0) {
            return 0;
        }
        if (n%10==8&&(n/10)%10==8) {
            return contadorOchos(n/10)+2;
        }
        if (n%10==8) {
            return contadorOchos(n/10)+1;
        }
        else{
            return contadorOchos(n/10);
        }
}
}
