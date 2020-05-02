package Model;

public class AreaValues {
    private double gridArea;
    private double randomArea;

    public AreaValues(double gridArea, double randomArea) {
        this.gridArea = gridArea;
        this.randomArea = randomArea;
    }


    public double getGridArea() {
        return gridArea;
    }

    public double getRandomArea() {
        return randomArea;
    }
}
