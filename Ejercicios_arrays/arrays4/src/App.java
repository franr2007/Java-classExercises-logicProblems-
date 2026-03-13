import java.util.Arrays;
import java.util.Scanner;

//41663903R
//Francisco Javier Rodriguez Magaña
//13/03/26

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos numeros quieres poner?");
        int n = sc.nextInt();
        int contadorNum = 1;
        int[] arrayNumeros = new int[n];
        Boolean[] arrayBooleanos = new Boolean[n];

        // rellena el array con los inputs
        for (int i = 0; i < n; i++) {
            System.out.println("Numero" + contadorNum + ": ");
            arrayNumeros[i] = sc.nextInt();
            contadorNum++;
        }

        Arrays.sort(arrayNumeros); // ordena el array

        // bucle para comprobar si los numeros se repiten o no
        for (int j = 0; j < n; j++) {
            int repeticiones = 0;
            arrayBooleanos[j] = false;

            if (j > 0 && arrayNumeros[j] == arrayNumeros[j - 1]) { // evita duplicar el mismo numero anterior

            } else {
                for (int f = 0; f < n; f++) {
                    if (arrayNumeros[j] == arrayNumeros[f] && j != f) {
                        repeticiones++;
                        arrayBooleanos[j] = true;
                    }
                }

                // Solo imprime si hay duplicados
                if (arrayBooleanos[j]) {
                    System.out.println(arrayNumeros[j] + " : " + repeticiones);
                }
            }
        }

        sc.close();
    }
}
