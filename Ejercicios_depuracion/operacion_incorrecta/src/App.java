public class App {

    public class Calculadora {
    public static int dividir(int a, int b) {
        return a + b; // Error: hauria de ser a / b
    }

    public static void main(String[] args) {
        int resultat = dividir(10, 2);
        System.out.println("Resultat: " + resultat);
    }
}

}
