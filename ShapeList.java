import java.util.ArrayList;

public class ShapeList {
    private ArrayList<Shape> listOfShapes;

    public ShapeList() {
        listOfShapes = new ArrayList<Shape>();
    }

    public void addShape(Shape s) {
        listOfShapes.add(s);
    }

    public void translateShapes(int dx, int dy) {
        for (int i = 0; i < listOfShapes.size(); i++) {
            listOfShapes.get(i).translate(dx, dy);
        }
    }

    public Shape getShape(int pos) {
        if (pos < 1 || pos > listOfShapes.size()) {
            System.out.println("Invalid position.");
            return null;
        }
        return listOfShapes.get(pos - 1);
    }

    public Shape removeShape(int pos) {
        if (pos < 1 || pos > listOfShapes.size()) {
            System.out.println("Invalid position.");
            return null;
        }
        return listOfShapes.remove(pos - 1);
    }

    public double area(int pos) {
        Shape s = getShape(pos);
        if (s == null) {
            return -1;
        }
        return s.getArea();
    }

    public void scale(int factor, boolean sign) {
        for (int i = 0; i < listOfShapes.size(); i++) {
            listOfShapes.get(i).scale(factor, sign);
        }
    }

    public double perimeter(int pos) {
        Shape s = getShape(pos);
        if (s == null) {
            return -1;
        }
        return s.getPerimeter();
    }

    public String display() {
        if (listOfShapes.size() == 0) {
            return "No shapes in the list.";
        }

        String result = "";
        for (int i = 0; i < listOfShapes.size(); i++) {
            result = result + (i + 1) + ". " + listOfShapes.get(i).display() + "\n";
        }
        return result;
    }

    public int getNumberOfShapes() {
        return listOfShapes.size();
    }
}