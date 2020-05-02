package Interface;

import Model.Model;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class WindowInitiator {
    private Window window;

    public Window startWindow(Model model) {
        try {
            SwingUtilities.invokeAndWait(() -> window = new Window(model));
        } catch (InterruptedException | InvocationTargetException e) {
            e.printStackTrace(System.out);
        }
        return window;
    }
}
