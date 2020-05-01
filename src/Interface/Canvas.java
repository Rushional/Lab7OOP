package Interface;

import GeomericFigures.Figure;
import GeomericFigures.Rectangle;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    private Figure currentFigure;

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
        if (currentFigure.getClass() == Rectangle.class) drawRectangle(g2d, (Rectangle) currentFigure);
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
