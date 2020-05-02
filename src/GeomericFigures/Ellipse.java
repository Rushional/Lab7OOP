package GeomericFigures;

import static java.lang.Math.pow;

public class Ellipse extends Figure {
    int semiMajorX, semiMinorY;

    public Ellipse(int semiMajorX, int semiMinorY) {
        this.semiMajorX = semiMajorX;
        this.semiMinorY = semiMinorY;
    }

    public boolean checkPointInside(int x, int y, int centerX, int centerY) {
        return (pow((x - centerX)/(double)semiMajorX, 2) + pow((y - centerY)/(double)semiMinorY, 2) <= 1);
    }

    public int getSemiMajorX() {
        return semiMajorX;
    }

    public int getSemiMinorY() {
        return semiMinorY;
    }
}
