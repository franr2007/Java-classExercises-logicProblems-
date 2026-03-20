import java.util.Scanner;

//francisco Javier Rodriguez
//41663903R
//20-03-26

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String s= "";
        boolean punto=false;
        int contador=0;

        while (!punto) {
            s+=sc.next().toLowerCase();
            if (s.charAt(s.length()-1)=='.') {
                punto=true;
            }
        }

        for(int i=0; i<s.length();i++){
            if (s.charAt(i)=='e') {
                contador++;
            }
        }

        System.out.println(contador);

        sc.close();
    }
}
