package Shape;

public class GeomatryTester {
    public static void main(String[] args) {

        Geom circle1 = new Circle();
        Geom rect1 = new Rectangle();
        Geom triangle1 = new Triangle();

        System.out.println(circle1.compareTo(rect1));
        System.out.println(triangle.compareTo(rect1));
        System.out.println(circle1.compareTo(triangle1));


    }
}
