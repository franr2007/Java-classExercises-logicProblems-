import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Problema 2 - Invertir secuencias
        //Qué hace: Lee varias secuencias y las imprime al revés.

        Scanner sc= new Scanner(System.in);
        ArrayList<String> arrListNum= new ArrayList<>();
        String num;
        boolean salir=false;

        while(sc.hasNext() && !salir){
            num=sc.next();
            if (num.equals(".")) {
                salir=true;
            }
            else arrListNum.add(num);
        }

        for(int i=arrListNum.size()-1; i>=0;i--){
            if (arrListNum.get(i).equals("0")) {
                System.out.println();
                System.out.println(0);
            }
            else System.out.print(arrListNum.get(i)+" ");
            }

        sc.close();


        //Solucion
        /*Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<String>> secuencias = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();

        while (true) {
            String num = sc.next();

            if (num.equals(".")) {
                break;
            }

            if (num.equals("0")) {
                secuencias.add(new ArrayList<>(actual));
                actual.clear();
            } 
            else {
                actual.add(num);
            }
        }
            
        // imprimir al revés
        for (int i = secuencias.size() - 1; i >= 0; i--) {
            ArrayList<String> seq = secuencias.get(i);

            for (int j = seq.size() - 1; j >= 0; j--) {
                System.out.print(seq.get(j) + " ");
            }
            System.out.println();
        } */
    }
}
