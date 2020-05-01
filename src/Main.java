import Area.AreaCalculator;
import GeomericFigures.Rectangle;
import Interface.Window;
import Interface.WindowInitiator;


public class Main {

    public static void main(String[] args) {
        WindowInitiator windowInitiator = new WindowInitiator();
        Window window = windowInitiator.startWindow();
        Rectangle rectangle = new Rectangle(400, 300, 400, 200);
        window.getCanvas().setCurrentFigure(rectangle);
        double resultGrid = AreaCalculator.calculateFreeAreaGrid(400, 200, 200,
                200, rectangle, 40, 20);
        System.out.println(resultGrid);
        double resultRandom = AreaCalculator.calculateFreeAreaRandom(400, 200, 200,
                200, rectangle, 40, 20);
        System.out.println(resultRandom);
    }
}
