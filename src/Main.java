public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        circle.displayInfo();
        System.out.println();
        rectangle.displayInfo();
    }
}
