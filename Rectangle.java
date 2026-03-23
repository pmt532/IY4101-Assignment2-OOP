public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(Coordinates coord, int width, int length) {
        super(4, coord);
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    public void scale(int factor, boolean sign) {
        super.scale(factor, sign);

        if (factor == 0) {
            System.out.println("Scale factor cannot be zero.");
            return;
        }

        if (sign) {
            width = width * factor;
            length = length * factor;
        } else {
            width = width / factor;
            length = length / factor;
        }
    }

    public String display() {
        return "Rectangle: Position = (" + position.display() + "), Width = " + width +
               ", Length = " + length + ", Area = " + getArea() +
               ", Perimeter = " + getPerimeter();
    }
}