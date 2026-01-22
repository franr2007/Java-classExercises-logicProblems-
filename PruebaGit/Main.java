public class Main  {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Cercle amb radi 5:");
        System.out.println("Àrea: " + circle.area());
        System.out.println("Perímetre: " + circle.perimeter());

        System.out.println("\nRectangle 4x6:");
        System.out.println("Àrea: " + rectangle.area());
        System.out.println("Perímetre: " + rectangle.perimeter());
    }
}
