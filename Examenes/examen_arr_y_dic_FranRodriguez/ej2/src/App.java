import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        boolean salir=false;
        int n= sc.nextInt();
        while (!salir) {
            if (n>=2) {
                salir=true;
            }
            else{
                n=sc.nextInt();
            }
        }

        int[] arr=new int[n]; 
        boolean doble= false;

        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            int numeroAct=arr[i];
            for(int j=0;j<n;j++){
                if (numeroAct*2==arr[j]) {
                    doble=true;
                }
            }
        }

        if (doble) {
            System.out.println("YES");
        }
        else System.out.println("NO");

        sc.close();
    }
}
