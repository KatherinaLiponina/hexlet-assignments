package exercise;

// BEGIN
public class Cottage implements Home {
    double area;
    int floorCount;

    Cottage(double a, int f) {
        area = a;
        floorCount = f;
    }

    @Override
    public double getArea() {
        return area;
    }

    public String toString() {
        return Integer.toString(floorCount) + " этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
