package GeomericFigures;

import static java.lang.Math.pow;

public class Circle extends Figure {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public boolean checkPointInside(int x, int y, int centerX, int centerY) {
        return (pow(x - centerX, 2) + pow(y - centerY, 2) <= pow(radius, 2));
    }

    public int getRadius() {
        return radius;
    }
}
