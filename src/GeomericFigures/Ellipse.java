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
        return (pow((x - centerX)/semiMajorX, 2) + pow((y - centerY)/semiMinorY, 2) <= 1);
    }
}
