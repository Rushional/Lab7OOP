package Interface;

import GeomericFigures.*;
import GeomericFigures.Point;
import GeomericFigures.Rectangle;
import Model.Model;
import Model.AreaCalculationData;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Canvas extends JPanel {
    private Model model;

    Canvas(Model model) {
        super();
        this.model = model;
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
        Figure figure = model.getCurrentFigure();
        if (figure.getClass() == Circle.class) drawCircle(g2d, (Circle) figure);
        else if (figure.getClass() == Ellipse.class) drawEllipse(g2d, (Ellipse) figure);
        else if (figure.getClass() == Rectangle.class || figure.getClass() == Square.class) drawRectangle(g2d, (Rectangle) figure);
        AreaCalculationData solution = model.getCurrentSolution();
        if (model.isGrid()) {
            drawInsidePoints(g2d, solution.getGridMethodPoints().getInsidePoints());
            drawOutsidePoints(g2d, solution.getGridMethodPoints().getOutsidePoints());
        }
        else {
            drawInsidePoints(g2d, solution.getRandomMethodPoints().getInsidePoints());
            drawOutsidePoints(g2d, solution.getRandomMethodPoints().getOutsidePoints());
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
}
