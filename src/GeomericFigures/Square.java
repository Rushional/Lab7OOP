package GeomericFigures;

public class Square extends Rectangle {
    int side;

    public Square(int x, int y, int side) {
        super(x, y, side, side);
    }

    @Override
    public boolean checkPointInside(int x, int y) {
        return false;
    }
}
