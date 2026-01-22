import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int contador = 0;
        int finaal = 0;
        int principi = 0;
        while (!salir) {
            String sequencia = sc.next();
            if (sequencia.equals("*")) {
                salir = true;
            }

            if (sequencia.equals("principi") && principi == 0) {
                boolean fin = false;
                principi++;
                while (!fin && finaal == 0) {
                    sequencia=sc.next();
                    if (sequencia.equals("final")) {
                        finaal++;
                        fin = true;
                    } else if (!sequencia.equals("final") && !sequencia.equals("principi") && !sequencia.equals("*")) {
                        contador++;
                    } else if(!sequencia.equals("final") && finaal==0) {
                        fin = true;
                        contador = 0;
                    }
                }
            }
            if (sequencia.equals("final")) {
                finaal++;
            }
        }
        if (contador > 0) {
            System.out.println(contador);
        } else {
            System.out.println("Incorrecte");
        }
    }
}
