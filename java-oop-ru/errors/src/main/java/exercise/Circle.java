package exercise;

// BEGIN
public class Circle {
    private Point center;
    private int radius;

    public Circle(Point p, int r) {
        center = p;
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Radius is negative");
        }
        return Math.PI * radius * radius;
    }
}
// END
