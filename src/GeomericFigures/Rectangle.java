package GeomericFigures;

public class Rectangle extends Figure {
    int lengthX, lengthY;

    public Rectangle(int centerX, int centerY, int lengthX, int lengthY) {
        super(centerX, centerY);
        this.lengthX = lengthX;
        this.lengthY = lengthY;
    }

    @Override
    public boolean checkPointInside(int x, int y) {
        return ((x <= centerX) && (y <= centerY));
    }
}
