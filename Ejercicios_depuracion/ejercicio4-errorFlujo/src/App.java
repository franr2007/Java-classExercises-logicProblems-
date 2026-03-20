public class App {
    public static int sumar(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            return suma; // Error: return dins del bucle
            suma += arr[i];
        }
        //return suma va aqui
    }
    public static void main(String[] args) throws Exception {
        int[] numeros = {1, 2, 3, 4};
        int total = sumar(numeros);
        System.out.println("Total: " + total);
    }
}
