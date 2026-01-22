import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int elem = 0;
        int maximo = 3143;
        int anterior=0;
        int siguiente=0;
        boolean si=false;
        while (sc.hasNextInt()) {
            elem = sc.nextInt();
            siguiente=anterior*2;

            if (anterior < elem && elem > maximo && elem>siguiente) {
                maximo = elem;
                si=true;
            }
            anterior=elem;
        }
        if (si) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
