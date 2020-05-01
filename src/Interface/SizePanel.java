package Interface;

import javax.swing.*;
import java.awt.*;

public abstract class SizePanel extends JPanel {
    private InputPanel inputPanel;

    public SizePanel(InputPanel inputPanel) {
        super();
        this.inputPanel = inputPanel;
        //        setBackground(new Color(116, 255, 207));
        setBackground(new Color(75, 103, 255));
        setPreferredSize(new Dimension(300, 200));
    }
}
