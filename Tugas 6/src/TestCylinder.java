public class TestCylinder {
        public static void main(String[] args) {
            // Declare and allocate a new instance of Cylinder with default color, radius, and height
            Cylinder c1 = new Cylinder();
            System.out.println("Cylinder:"
                    + " radius=" + c1.getRadius()
                    + " height=" + c1.getHeight()
                    + " surface area=" + c1.getArea()  // Now displays surface area
                    + " volume=" + c1.getVolume());
    
            // Declare and allocate a new instance of Cylinder specifying height, with default color and radius
            Cylinder c2 = new Cylinder(10.0);
            System.out.println("Cylinder:"
                    + " radius=" + c2.getRadius()
                    + " height=" + c2.getHeight()
                    + " surface area=" + c2.getArea()  // Now displays surface area
                    + " volume=" + c2.getVolume());
    
            // Declare and allocate a new instance of Cylinder specifying radius and height, with default color
            Cylinder c3 = new Cylinder(2.0, 10.0);
            System.out.println("Cylinder:"
                    + " radius=" + c3.getRadius()
                    + " height=" + c3.getHeight()
                    + " surface area=" + c3.getArea()  // Now displays surface area
                    + " volume=" + c3.getVolume());
        }
    }
    