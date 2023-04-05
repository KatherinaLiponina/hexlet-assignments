package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyArea;
    int floor;

    Flat(double a, double b, int f) {
        area = a;
        balconyArea = b;
        floor = f;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    public String toString() {
        return "Квартира площадью " + this.getArea() + " метров на " + this.getFloor() + " этаже";
    }
}
// END
