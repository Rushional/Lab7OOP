package Model;

import GeomericFigures.Point;

import java.util.ArrayList;

public class AreaPoints {
    private ArrayList<Point> insidePoints;
    private ArrayList<Point> outsidePoints;

    public AreaPoints(ArrayList<Point> insidePoints, ArrayList<Point> outsidePoints) {
        this.insidePoints = insidePoints;
        this.outsidePoints = outsidePoints;
    }

    public ArrayList<Point> getInsidePoints() {
        return insidePoints;
    }

    public ArrayList<Point> getOutsidePoints() {
        return outsidePoints;
    }
}
