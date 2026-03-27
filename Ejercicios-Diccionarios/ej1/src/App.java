
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        TreeMap casino = new TreeMap<>();
        boolean fin=false;

        while (!fin && sc.hasNext()) {
            String nombre=sc.next().toLowerCase();
            String accion=sc.next().toLowerCase();

            switch (accion) {
                case "enter":
                    
                    break;
                case "leaves":
                    
                    break;
                case "wins":
                    
                    break;
                case "ends":
                    fin=true;
                    break;
            
                default:
                    break;
            }
        }
        sc.close();
    }
}
