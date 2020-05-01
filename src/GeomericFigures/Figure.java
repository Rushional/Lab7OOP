package GeomericFigures;

public abstract class Figure {
    int centerX, centerY;

    public Figure(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public abstract boolean checkPointInside(int x, int y);

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }
}
