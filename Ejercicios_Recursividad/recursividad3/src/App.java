import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        System.out.println(invertir(palabra, 0));
    }

    public static String invertir(String s, int numero) {
        if (numero == s.length()) {
            return "";
        }
        return invertir(s, numero + 1) + s.charAt(numero);
    }
}
