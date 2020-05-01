import Area.AreaCalculator;
import GeomericFigures.Circle;
import GeomericFigures.Ellipse;
import GeomericFigures.Rectangle;
import Interface.Window;
import Interface.WindowInitiator;


public class Main {

    public static void main(String[] args) {
        WindowInitiator windowInitiator = new WindowInitiator();
        Window window = windowInitiator.startWindow();
//        Rectangle figure = new Rectangle(400, 300, 210, 130);
        Circle figure = new Circle(400, 300, 100);
        window.getCanvas().setCurrentFigure(figure);
        double resultGrid = AreaCalculator.calculateFreeAreaGrid(400, 200, 200,
                200, figure, 41, 21, window.getCanvas());
        System.out.println(resultGrid);
        double resultRandom = AreaCalculator.calculateFreeAreaRandom(400, 200, 200,
                200, figure, 41, 21, window.getCanvas());
        System.out.println(resultRandom);
    }
}
