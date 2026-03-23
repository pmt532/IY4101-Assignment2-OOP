public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Coordinates p) {
        int dx = p.getX() - x;
        int dy = p.getY() - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public void scale(int factor, boolean sign) {
        if (factor == 0) {
            System.out.println("Scale factor cannot be zero.");
            return;
        }

        if (sign) { // multiply
            x = x * factor;
            y = y * factor;
        } else { // divide
            x = x / factor;
            y = y / factor;
        }
    }

    public String display() {
        return "X = " + x + ", Y = " + y;
    }
}