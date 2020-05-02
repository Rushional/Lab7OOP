package Model;

public class AreaCalculationData {
    private AreaPoints gridMethodPoints;
    private AreaPoints randomMethodPoints;
    private AreaValues values;

    public AreaCalculationData(AreaPoints gridMethodPoints, AreaPoints randomMethodPoints, AreaValues values) {
        this.gridMethodPoints = gridMethodPoints;
        this.randomMethodPoints = randomMethodPoints;
        this.values = values;
    }


    public AreaPoints getGridMethodPoints() {
        return gridMethodPoints;
    }


    public AreaPoints getRandomMethodPoints() {
        return randomMethodPoints;
    }

    public AreaValues getValues() {
        return values;
    }
}
