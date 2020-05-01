package Interface;

import GeomericFigures.*;
import GeomericFigures.Point;
import GeomericFigures.Rectangle;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Canvas extends JPanel {
    private Figure currentFigure;
    private InputPanel inputPanel;
    private ArrayList<Point> gridInsidePoints;
    private ArrayList<Point> gridOutsidePoints;
    private ArrayList<Point> randomInsidePoints;
    private ArrayList<Point> randomOutsidePoints;

    Canvas() {
        super();
        setBackground(new Color(173, 196, 228));
        setPreferredSize(new Dimension(800, 500));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        drawCoordinatesGrid(g2d);
        drawTarget(g2d);
        if (currentFigure.getClass() == Rectangle.class || currentFigure.getClass() == Square.class) drawRectangle(g2d, (Rectangle) currentFigure);
        else if (currentFigure.getClass() == Ellipse.class) drawEllipse(g2d, (Ellipse) currentFigure);
        else if (currentFigure.getClass() == Circle.class) drawCircle(g2d, (Circle) currentFigure);
        if (inputPanel.isGrid()) {
            if (gridInsidePoints != null) drawInsidePoints(g2d, gridInsidePoints);
            if (gridOutsidePoints != null) drawOutsidePoints(g2d, gridOutsidePoints);
        }
        else {
            if (randomInsidePoints != null) drawInsidePoints(g2d, randomInsidePoints);
            if (randomOutsidePoints != null) drawOutsidePoints(g2d, randomOutsidePoints);
        }
        g2d.setColor(Color.black);
    }

    private void drawTarget(Graphics2D g2d) {
        g2d.drawPolygon(
                new int[] {200, 200, 600, 600},
                new int[] {200, 400, 400, 200},
                4
        );
        g2d.drawPolygon(
                new int[] {198, 198, 602, 602},
                new int[] {198, 402, 402, 198},
                4
        );
    }

    public void setInputPanel(InputPanel inputPanel) {
        this.inputPanel = inputPanel;
    }

    private void drawCoordinatesGrid(Graphics2D g2d){
        int step = 50;
        int sizeX = getSize().width;
        int sizeY = getSize().height;
        int i;
        for (i = 0; i < sizeX; i+= step){
            g2d.drawString((String.valueOf(i)), i + 1, 11);
        }
        for (i = 0; i < sizeY; i+= step){
            g2d.drawString((String.valueOf(i)), 1, i-1);
        }
        //gray
        Color colorOld = g2d.getColor();
//        java.awt.Color color = new java.awt.Color(142, 145, 180); //I used this to comfortably choose color in idea
        g2d.setColor(new Color(142, 145, 180));
        for (i = 0; i < sizeX; i+= step){
            g2d.drawLine(i, 0, i, sizeY);
        }
        for (i = 0; i < sizeY; i+= step){
            g2d.drawLine(0, i, sizeX, i);
        }
        g2d.setColor(colorOld);
    }

    private void drawInsidePoints(Graphics2D g2d, ArrayList<Point> insidePoints) {
        Color colorOld = g2d.getColor();
        g2d.setColor(new Color(0, 0, 150));
        insidePoints.forEach((point -> {
            g2d.drawOval(point.getX() - 2, point.getY() - 2, 4, 4);
            g2d.fillOval(point.getX() - 2, point.getY() - 2, 4, 4);
        }));
        g2d.setColor(colorOld);
    }

    private void drawOutsidePoints(Graphics2D g2d, ArrayList<Point> outsidePoints) {
        Color colorOld = g2d.getColor();
        g2d.setColor(new Color(0, 0, 150));
        outsidePoints.forEach((point -> {
            g2d.drawLine(point.getX(), point.getY(), point.getX(), point.getY());

        }));
        g2d.setColor(colorOld);
    }

    private void drawCircle(Graphics2D g2d, Circle circle) {
        int radius = circle.getRadius();
        int startX = circle.getCenterX() - radius;
        int startY = circle.getCenterY() - radius;
        g2d.drawOval(startX, startY, radius * 2, radius * 2);
    }

    private void drawEllipse(Graphics2D g2d, Ellipse ellipse) {
        int startX = ellipse.getCenterX() - ellipse.getSemiMajorX();
        int startY = ellipse.getCenterY() - ellipse.getSemiMinorY();
        g2d.drawOval(startX, startY, ellipse.getSemiMajorX() * 2, ellipse.getSemiMinorY() * 2);
    }

    private void drawRectangle(Graphics2D g2d, Rectangle rectangle) {
        int leftX = rectangle.getCenterX() - rectangle.getLengthX()/2;
        int rightX = rectangle.getCenterX() + rectangle.getLengthX()/2;
        int upperY = rectangle.getCenterY() - rectangle.getLengthY()/2;
        int lowerY = rectangle.getCenterY() + rectangle.getLengthY()/2;
        g2d.drawPolygon(
                new int[] {leftX, rightX, rightX, leftX},
                new int[] {upperY, upperY, lowerY, lowerY},
                4
        );
    }

    public void setCurrentFigure(Figure currentFigure) {
        this.currentFigure = currentFigure;
    }

    public void setGridInsidePoints(ArrayList<Point> gridInsidePoints) {
        this.gridInsidePoints = gridInsidePoints;
    }

    public void setGridOutsidePoints(ArrayList<Point> gridOutsidePoints) {
        this.gridOutsidePoints = gridOutsidePoints;
    }

    public void setRandomInsidePoints(ArrayList<Point> randomInsidePoints) {
        this.randomInsidePoints = randomInsidePoints;
    }

    public void setRandomOutsidePoints(ArrayList<Point> randomOutsidePoints) {
        this.randomOutsidePoints = randomOutsidePoints;
    }

//    private void drawTriangle(Graphics2D g2d, TriangleCoordinates coordinates) {
//        g2d.drawPolygon(coordinates.getCoordinatesX(), coordinates.getCoordinatesY(), 3);
//    }
//
//    void setCoordinatesSimple(TriangleCoordinates coordinatesSimple) {
//        this.coordinatesSimple = coordinatesSimple;
//    }
//
//    void setCoordinatesIsosceles(TriangleCoordinates coordinatesIsosceles) {
//        this.coordinatesIsosceles = coordinatesIsosceles;
//    }
//
//    void setCoordinatesEquilateral(TriangleCoordinates coordinatesEquilateral) {
//        this.coordinatesEquilateral = coordinatesEquilateral;
//    }
}
