package exercise;

// BEGIN
public interface Home {
    public double getArea();
    default public int compareTo(Home h) {
        double currentArea = this.getArea();
        double hArea = h.getArea();
        if (currentArea == hArea) {
            return 0;
        }
        if (currentArea > hArea) {
            return 1;
        }
        return -1;
    }
}
// END
