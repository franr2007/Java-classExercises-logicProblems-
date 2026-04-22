import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Problema 1 - Contar elementos iguales al último
        //Qué hace: Lee n números y cuenta cuántos son iguales al último (sin contar el último).

        //atributos
        Scanner sc= new Scanner(System.in);
        System.out.print("cuantos numeros vas a poner: ");
        int largoArray=sc.nextInt();
        int[] arrayNum= new int[largoArray];
        int numSelect=0;
        int contarNum=0;

        for(int i=0; i<largoArray; i++){
            arrayNum[i]=sc.nextInt();
        };

        numSelect=arrayNum[largoArray-1];

        for(int j=0; j<largoArray-1;j++){
            if (arrayNum[j]==numSelect) {
                contarNum++;
            }
        }

        System.out.println(contarNum);

        sc.close();
    }
}