import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(countaa(s));
        sc.close();
    }

    public static int buscadora(String s){
        int contador=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='a') {
                contador++;
            }
        }
        return contador;
    }

    public static int countaa(String s){
        if (s.length()<=1) {
            return 0;
        }
        else{
            if (buscadora(s)>2&&s.charAt(0)=='a'&&s.charAt(1)=='a') {
                return countaa(s.substring(1, s.length()))+2;
            }
            else if (s.charAt(0)=='a'&&s.charAt(1)=='a') {
                return countaa(s.substring(1, s.length()))+1;
            }
            else return countaa(s.substring(1, s.length()));
        }
    }
}
