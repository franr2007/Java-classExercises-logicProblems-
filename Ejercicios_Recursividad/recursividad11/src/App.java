import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez Magaña
//30-01-26

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe una palabra:");
        String s=sc.nextLine().toLowerCase();
        System.out.println(countSi(s));
        sc.close();
    }
    public static int countSi(String s){
        if (s.length()==0) {
            return 0;
        }
        if (s.charAt(0)=='s'&&s.charAt(1)=='i') {
            return 1+countSi(s.substring(2, s.length()));
        }
        else{
            return countSi(s.substring(1, s.length()));
        }
    }
}
