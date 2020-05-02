package Model;

import GeomericFigures.Figure;
import GeomericFigures.Point;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class AreaCalculator {
    public static AreaCalculationData calculateFreeArea(int targetLengthX, int targetLengthY, int targetCoordX, int targetCoordY,
                                    Figure figure, int horizontalPointsAmount, int verticalPointsAmount, int centerX, int centerY) {
        ArrayList<Point> gridInsidePoints = new ArrayList<>();
        ArrayList<Point> gridOutsidePoints = new ArrayList<>();
        int currentX = targetCoordX;
        int currentY = targetCoordY;
        int stepX = targetLengthX/(horizontalPointsAmount - 1);
        int stepY = targetLengthY/(verticalPointsAmount - 1);
        int pointsTotal = horizontalPointsAmount * verticalPointsAmount;
        int gridPointsInsideFigure = 0;
        for (int verticalPoint = 0; verticalPoint < verticalPointsAmount; verticalPoint++) {
            for (int horizontalPoint = 0; horizontalPoint < horizontalPointsAmount; horizontalPoint++) {
                if (figure.checkPointInside(currentX, currentY, centerX, centerY)) {
                    gridPointsInsideFigure++;
                    gridInsidePoints.add(new Point(currentX, currentY));
                }
                else gridOutsidePoints.add(new Point(currentX, currentY));
                currentX += stepX;
            }
            currentX = targetCoordX;
            currentY += stepY;
        }
        AreaPoints gridPoints = new AreaPoints(gridInsidePoints, gridOutsidePoints);
        double gridAreaValue =  (double)(pointsTotal - gridPointsInsideFigure)/pointsTotal;

        ArrayList<Point> randomInsidePoints = new ArrayList<>();
        ArrayList<Point> randomOutsidePoints = new ArrayList<>();
        int randomPointsInsideFigure = 0;
        for (int point = 0; point < pointsTotal; point++) {
            // nextInt is normally exclusive of the top value, so add 1 to make it inclusive
            int randomX = ThreadLocalRandom.current().nextInt(targetCoordX, targetCoordX + targetLengthX + 1);
            int randomY = ThreadLocalRandom.current().nextInt(targetCoordY, targetCoordY + targetLengthY + 1);
            if (figure.checkPointInside(randomX, randomY, centerX, centerY)) {
                randomPointsInsideFigure++;
                randomInsidePoints.add(new Point(randomX, randomY));
            }
            else randomOutsidePoints.add(new Point(randomX, randomY));
        }
        AreaPoints randomPoints = new AreaPoints(randomInsidePoints, randomOutsidePoints);
        double randomAreaValue =  (double)(pointsTotal - randomPointsInsideFigure)/pointsTotal;
        AreaValues values = new AreaValues(gridAreaValue, randomAreaValue);
        return new AreaCalculationData(gridPoints, randomPoints, values);
    }
}
