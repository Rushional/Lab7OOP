package Interface;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class WindowInitiator {
    private Window window;

    public void startWindow() {
        try {
            SwingUtilities.invokeAndWait(() -> window = new Window());
        } catch (InterruptedException | InvocationTargetException e) {
            e.printStackTrace(System.out);
        }
    }
}
