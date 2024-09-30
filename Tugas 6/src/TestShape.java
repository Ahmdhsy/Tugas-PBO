public class TestShape {
    public static void main(String[] args) {
        // Test Shape
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        // Test Circle
        Circle circle = new Circle(2.5);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Test Rectangle
        Rectangle rectangle = new Rectangle(2.0, 4.0);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Test Square
        Square square = new Square(3.0);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
