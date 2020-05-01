package Area;

import GeomericFigures.Figure;
import java.util.concurrent.ThreadLocalRandom;

public class AreaCalculator {
    public static double calculateFreeAreaGrid(int targetLengthX, int targetLengthY, int targetCoordX, int targetCoordY,
                                    Figure figure, int horizontalPointsAmount, int verticalPointsAmount) {
        int currentX = targetCoordX;
        int currentY = targetCoordY;
        int stepX = targetLengthX/horizontalPointsAmount;
        int stepY = targetLengthY/verticalPointsAmount;
        int pointsTotal = horizontalPointsAmount * verticalPointsAmount;
        int pointsInsideFigure = 0;
        for (int verticalPoint = 0; verticalPoint < verticalPointsAmount; verticalPoint++) {
            for (int horizontalPoint = 0; horizontalPoint < horizontalPointsAmount; horizontalPoint++) {
                if (figure.checkPointInside(currentX, currentY)) pointsInsideFigure++;
                currentX += stepX;
            }
            currentX = targetCoordX;
            currentY += stepY;
        }
        return (double)(pointsTotal - pointsInsideFigure)/pointsTotal;
    }

    public static double calculateFreeAreaRandom(int targetLengthX, int targetLengthY, int targetCoordX, int targetCoordY,
                                          Figure figure, int horizontalPointsAmount, int verticalPointsAmount) {
        int pointsTotal = horizontalPointsAmount * verticalPointsAmount;
        int pointsInsideFigure = 0;
        for (int point = 0; point < pointsTotal; point++) {
            // nextInt is normally exclusive of the top value, so add 1 to make it inclusive
            int randomX = ThreadLocalRandom.current().nextInt(targetCoordX, targetCoordX + targetLengthX + 1);
            int randomY = ThreadLocalRandom.current().nextInt(targetCoordY, targetCoordY + targetLengthY + 1);
            if (figure.checkPointInside(randomX, randomY)) pointsInsideFigure++;
        }
        return (double)(pointsTotal - pointsInsideFigure)/pointsTotal;
    }
}
