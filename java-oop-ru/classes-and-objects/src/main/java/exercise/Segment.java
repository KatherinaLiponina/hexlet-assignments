package exercise;

// BEGIN
public class Segment {
    private Point begin;
    private Point end;
    Segment(Point b, Point e) {
        begin = b;
        end = e;
    }

    Point getBeginPoint() {
        return begin;
    }
    Point getEndPoint() {
        return end;
    }
    Point getMidPoint() {
        return new Point((begin.getX() + end.getX()) / 2, (begin.getY() + end.getY()) / 2);
    }
}
// END
