import java.util.Scanner;

//41663903R
//francisco Javier Rodriguez Magaña
//11/03/26

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        System.out.println("cuantas palabras quieres introducir?");
        int n= sc.nextInt();
        int contadorP=1;
        String[] arrayWords= new String[n];

        // rellena el array
        for(int i=0; i<n; i++){
            System.out.print("palabra"+contadorP+": ");
            arrayWords[i]=sc.next();
            contadorP++;
        }

        //recorre el array al reves
        for(int j=n-1; j>=0; j--){
            String word= arrayWords[j];

            //recorre la palabra tambien al reves
            for(int f= word.length()-1; f>=0; f--){
                System.out.print(word.charAt(f));
            }
            System.out.println();
        }

        sc.close();
    }
}
