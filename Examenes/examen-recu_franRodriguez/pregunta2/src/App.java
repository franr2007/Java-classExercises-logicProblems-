import java.util.Scanner;

//francisco Javier Rodriguez
//41663903R
//20-03-26

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = "";
        boolean punto = false;
        int x=0;
        int y=0;

        while (!punto) {
            s += sc.next().toLowerCase();
            if (s.charAt(s.length()-1)=='.') {
                punto=true;
            }
        }

        for(int i=0; i<s.length();i++){
            switch (s.charAt(i)) {
                case 'n':
                    y--;
                    break;
                case 's':
                    y++;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;
            
                default:
                    break;
            }
        }

        System.out.println("("+x+","+y+")");

        sc.close();
    }
}
