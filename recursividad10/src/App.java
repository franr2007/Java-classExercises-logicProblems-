import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez Magaña
//30-01-26

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe una palabra:");
        String s=sc.nextLine();
        System.out.println(countD(s));
        sc.close();
    }

    public static int countD(String s){
        if (s.length()==0) {
            return 0;
        }
        if (s.charAt(0)=='d') {
            return 1+countD(s.substring(1, s.length()));
        }
        else{
            return countD(s.substring(1,s.length()));
        }
    }
}
