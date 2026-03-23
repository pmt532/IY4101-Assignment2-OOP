public class Circle extends Shape {
    private int radius;

    public Circle(Coordinates coord, int radius) {
        super(0, coord);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void scale(int factor, boolean sign) {
        super.scale(factor, sign);

        if (factor == 0) {
            System.out.println("Scale factor cannot be zero.");
            return;
        }

        if (sign) {
            radius = radius * factor;
        } else {
            radius = radius / factor;
        }
    }

    public String display() {
        return "Circle: Position = (" + position.display() + "), Radius = " + radius +
               ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}