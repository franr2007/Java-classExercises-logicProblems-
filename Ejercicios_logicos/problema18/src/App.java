import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int elem=sc.nextInt();
        boolean salir=false;
        boolean eraPar;
        if (elem%2==0) {
            eraPar=true;
        }else{
            eraPar=false;
        }

        while (sc.hasNextInt() && !salir) {
            elem=sc.nextInt();
            if (elem%2==0) {
                eraPar=true;
            }
            else{
                eraPar=false;
            }
            if (eraPar && (elem%2==0) || !eraPar && (elem%2!=0)) {
                salir=true;
            }
        }
        if (salir) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
