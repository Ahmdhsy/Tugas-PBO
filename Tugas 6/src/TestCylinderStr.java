public class TestCylinderStr {
    public static void main(String[] args) {
        // Declare and allocate a new instance of Cylinder with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println(c1.toString()); // Test the toString method

        // Declare and allocate a new instance of Cylinder specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2.toString()); // Test the toString method

        // Declare and allocate a new instance of Cylinder specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3.toString()); // Test the toString method
    }
}
