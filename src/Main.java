import Interface.Window;
import Interface.WindowInitiator;
import Model.Model;


public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        WindowInitiator windowInitiator = new WindowInitiator();
        Window window = windowInitiator.startWindow(model);
    }
}
