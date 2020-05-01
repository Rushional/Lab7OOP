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
        int borderLeft = centerX - lengthX/2;
        int borderRight = centerX + lengthX/2;
        int borderTop = centerY - lengthY/2;
        int borderBottom = centerY + lengthY/2;
        return ((x >= borderLeft) && (x <= borderRight) &&
                (y >= borderTop) && (y <= borderBottom));
    }

    public int getLengthX() {
        return lengthX;
    }

    public int getLengthY() {
        return lengthY;
    }
}
