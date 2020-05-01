package GeomericFigures;

import static java.lang.Math.pow;

public class Circle extends Figure {
    int radius;

    public Circle(int centerX, int centerY, int radius) {
        super(centerX, centerY);
        this.radius = radius;
    }

    public boolean checkPointInside(int x, int y) {
        return (pow(x - centerX, 2) + pow(y - centerY, 2) <= pow(radius, 2));
    }
}
