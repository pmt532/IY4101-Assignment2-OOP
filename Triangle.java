public class Triangle extends Shape {
    private Coordinates p1;
    private Coordinates p2;
    private Coordinates p3;

    public Triangle(Coordinates p1, Coordinates p2, Coordinates p3) {
        super(3, p1);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p1.distance(p3);
        return a + b + c;
    }

    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p1.distance(p3);
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public void translate(int dx, int dy) {
        p1.translate(dx, dy);
        p2.translate(dx, dy);
        p3.translate(dx, dy);
        position = p1;
    }

    public void scale(int factor, boolean sign) {
        if (factor == 0) {
            System.out.println("Scale factor cannot be zero.");
            return;
        }

        p1.scale(factor, sign);
        p2.scale(factor, sign);
        p3.scale(factor, sign);
        position = p1;
    }

    public String display() {
        return "Triangle: P1 = (" + p1.display() + "), P2 = (" + p2.display() +
               "), P3 = (" + p3.display() + "), Area = " + getArea() +
               ", Perimeter = " + getPerimeter();
    }
}