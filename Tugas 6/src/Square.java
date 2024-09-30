public class Square extends Rectangle {

    // Constructor with side
    public Square(double side) {
        super(side, side);
    }

    // Constructor with side, color, and filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }

    // Override setLength and setWidth to ensure both values are the same
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
}
