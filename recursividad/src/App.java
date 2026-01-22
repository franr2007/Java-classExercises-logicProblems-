//41663903R
//Francisco Javier Rodriguez

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(recursivo(10));
    }

    public static int recursivo(int n){
        if (n<=9) {
            return 1;
        }
        
        return recursivo(n/10)+1;
    }
}
