import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez Magaña
//04-02-2026

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        System.out.println(replazarX(s));
        sc.close();
    }
    public static String replazarX(String s){
        if (s.length()==0) {
            return "";
        }
        else{
            if (s.charAt(0)=='x') {
                return 'y'+replazarX(s.substring(1, s.length()));
            }
            else return s.charAt(0) + replazarX(s.substring(1, s.length()));
        } 
    }
}
