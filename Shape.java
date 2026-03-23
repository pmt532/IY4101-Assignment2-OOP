public class Shape {
    protected Coordinates position;
    protected int sides;

    public Shape(int noOfSides, Coordinates coord) {
        sides = noOfSides;
        position = coord;
    }

    public Coordinates getCoordinates() {
        return position;
    }

    public int getSides() {
        return sides;
    }

    public void setCoordinates(Coordinates newcoord) {
        position = newcoord;
    }

    public void translate(int dx, int dy) {
        position.translate(dx, dy);
    }

    public void scale(int factor, boolean sign) {
        position.scale(factor, sign);
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public String display() {
        return "Shape at (" + position.display() + "), Sides = " + sides +
               ", Area = " + getArea() +
               ", Perimeter = " + getPerimeter();
    }
}