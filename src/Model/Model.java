package Model;

import GeomericFigures.*;

public class Model {
    private Figure currentFigure;
    private static int targetLength = 400, targetHeight = 200, targetCoordX = 200, targetCoordY = 200;
    private boolean isCircle = true, isEllipse = false, isRectangle = false, isSquare = false;
    private boolean isGrid = true;
    private AreaCalculationData currentSolution;

    public Model() {
        currentFigure = new Circle(400, 300, 100);
        currentSolution = AreaCalculator.calculateFreeArea(targetLength, targetHeight, targetCoordX, targetCoordY,
                currentFigure, 41, 21);
        System.out.println("Grid method area: " + currentSolution.getValues().getGridArea());
        System.out.println("Grid random area: " + currentSolution.getValues().getRandomArea());
    }

    public void moveFigure(int centerX, int centerY) {

    }

    public void replaceWithCircle(int centerX, int centerY, int radius, int horizontalPointsAmount, int verticalPointsAmount) {
        currentFigure = new Circle(centerX, centerY, radius);
        currentSolution = AreaCalculator.calculateFreeArea(targetLength, targetHeight, targetCoordX, targetCoordY,
                currentFigure, horizontalPointsAmount, verticalPointsAmount);
    }

    public void replaceWithEllipse(int centerX, int centerY, int semiMajorX, int semiMinorY,
                                   int horizontalPointsAmount, int verticalPointsAmount) {
        currentFigure = new Ellipse(centerX, centerY, semiMajorX, semiMinorY);
        currentSolution = AreaCalculator.calculateFreeArea(targetLength, targetHeight, targetCoordX, targetCoordY,
                currentFigure, horizontalPointsAmount, verticalPointsAmount);
    }

    public void replaceWithRectangle(int centerX, int centerY, int lengthX, int lengthY,
                                     int horizontalPointsAmount, int verticalPointsAmount) {
        currentFigure = new Rectangle(centerX, centerY, lengthX, lengthY);
        currentSolution = AreaCalculator.calculateFreeArea(targetLength, targetHeight, targetCoordX, targetCoordY,
                currentFigure, horizontalPointsAmount, verticalPointsAmount);
    }

    public void replaceWithSquare(int centerX, int centerY, int side, int horizontalPointsAmount, int verticalPointsAmount) {
        currentFigure = new Square(centerX, centerY, side);
        currentSolution = AreaCalculator.calculateFreeArea(targetLength, targetHeight, targetCoordX, targetCoordY,
                currentFigure, horizontalPointsAmount, verticalPointsAmount);
    }

    public Figure getCurrentFigure() {
        return currentFigure;
    }

    public boolean isGrid() {
        return isGrid;
    }

    public void setGrid(boolean grid) {
        isGrid = grid;
    }

    public boolean isCircle() {
        return isCircle;
    }

    public void setCircle(boolean circle) {
        isCircle = circle;
    }

    public boolean isEllipse() {
        return isEllipse;
    }

    public void setEllipse(boolean ellipse) {
        isEllipse = ellipse;
    }

    public boolean isRectangle() {
        return isRectangle;
    }

    public void setRectangle(boolean rectangle) {
        isRectangle = rectangle;
    }

    public boolean isSquare() {
        return isSquare;
    }

    public void setSquare(boolean square) {
        isSquare = square;
    }

    public AreaCalculationData getCurrentSolution() {
        return currentSolution;
    }
}
