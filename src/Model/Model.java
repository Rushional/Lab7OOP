package Model;

import GeomericFigures.*;

public class Model {
    private Figure currentFigure;
    private int currentCenterX, currentCenterY;
    private int currentHorizontalPointsAmount;
    private int currentVerticalPointsAmount;
    private static int targetLength = 400, targetHeight = 200, targetCoordX = 200, targetCoordY = 200;
    private boolean isGrid = true;
    private AreaCalculationData currentSolution;

    public Model() {
        currentFigure = new Circle(100);
        currentCenterX = 400;
        currentCenterY = 300;
        currentHorizontalPointsAmount = 41;
        currentVerticalPointsAmount = 21;
        calculateFreeArea();
        System.out.println("Grid method area: " + currentSolution.getValues().getGridArea());
        System.out.println("Grid random area: " + currentSolution.getValues().getRandomArea());
    }

    private void calculateFreeArea() {
        currentSolution = AreaCalculator.calculateFreeArea(targetLength, targetHeight, targetCoordX, targetCoordY,
                currentFigure, currentHorizontalPointsAmount, currentVerticalPointsAmount, currentCenterX, currentCenterY);
    }

    public void replaceWithCircle(int radius) {
        currentFigure = new Circle(radius);
        calculateFreeArea();
    }

    public void replaceWithEllipse(int semiMajorX, int semiMinorY) {
        currentFigure = new Ellipse(semiMajorX, semiMinorY);
        calculateFreeArea();
    }

    public void replaceWithRectangle(int lengthX, int lengthY) {
        currentFigure = new Rectangle(lengthX, lengthY);
        calculateFreeArea();
    }

    public void replaceWithSquare(int side) {
        currentFigure = new Square(side);
        calculateFreeArea();
    }

    public Figure getCurrentFigure() {
        return currentFigure;
    }

    public int getCurrentCenterX() {
        return currentCenterX;
    }

    public void setCurrentCenterX(int currentCenterX) {
        this.currentCenterX = currentCenterX;
        calculateFreeArea();
    }

    public int getCurrentCenterY() {
        return currentCenterY;
    }

    public void setCurrentCenterY(int currentCenterY) {
        this.currentCenterY = currentCenterY;
        calculateFreeArea();
    }

    public boolean isGrid() {
        return isGrid;
    }

    public void setGrid(boolean grid) {
        isGrid = grid;
    }

    public void setCurrentHorizontalPointsAmount(int currentHorizontalPointsAmount) {
        this.currentHorizontalPointsAmount = currentHorizontalPointsAmount;
        calculateFreeArea();
    }

    public void setCurrentVerticalPointsAmount(int currentVerticalPointsAmount) {
        this.currentVerticalPointsAmount = currentVerticalPointsAmount;
        calculateFreeArea();
    }

    public AreaCalculationData getCurrentSolution() {
        return currentSolution;
    }
}
