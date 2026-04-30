import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean fin = false;
        int contador = 1;
        while (!fin && sc.hasNext()) {
            String numL = sc.next();
            String elem1 = sc.next();
            String elem2=sc.next();
            if (elem1.equals("#")) {
                fin = true;
            }
            if (elem1.compareTo(elem2) <= 0) {
                System.out.println("the line " + contador + " is increasing order");
            } else {
                System.out.println("there is no line in increasing order");
            }
            contador++;
        }
        sc.close();
    }
}
