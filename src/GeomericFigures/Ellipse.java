package GeomericFigures;

import static java.lang.Math.pow;

public class Ellipse extends Figure {
    int semiMajorX, semiMinorY;

    public Ellipse(int x, int y, int semiMajorX, int semiMinorY) {
        super(x, y);
        this.semiMajorX = semiMajorX;
        this.semiMinorY = semiMinorY;
    }

    public boolean checkPointInside(int x, int y) {
        return (pow((x - centerX)/(double)semiMajorX, 2) + pow((y - centerY)/(double)semiMinorY, 2) <= 1);
    }
}
