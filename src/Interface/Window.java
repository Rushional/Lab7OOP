package Interface;

import javax.swing.*;
import java.awt.*;

class Window extends JFrame {

    Window() {
        super("OOP Lab6");
        setLayout(new GridBagLayout());
        Canvas canvas = new Canvas();
        InputPanel inputPanel = new InputPanel(canvas);
        CircleSizePanel circleSizePanel = new CircleSizePanel(inputPanel);
        GridBagConstraints inputPanelConstraints = new GridBagConstraints();
        inputPanelConstraints.fill = GridBagConstraints.NONE;
        inputPanelConstraints.weightx = 0;
        inputPanelConstraints.weighty = 0;
        inputPanelConstraints.gridx = 0;
        inputPanelConstraints.gridy = 0;
        add(inputPanel, inputPanelConstraints);
        GridBagConstraints circleSizePanelConstraints = new GridBagConstraints();
        circleSizePanelConstraints.fill = GridBagConstraints.NONE;
        circleSizePanelConstraints.weightx = 0;
        circleSizePanelConstraints.weighty = 0;
        circleSizePanelConstraints.gridx = 0;
        circleSizePanelConstraints.gridy = 1;
        add(circleSizePanel, circleSizePanelConstraints);
        GridBagConstraints canvasConstraints = new GridBagConstraints();
        canvasConstraints.weightx = 0;
        canvasConstraints.weighty = 0;
        canvasConstraints.gridx = 1;
        canvasConstraints.gridy = 0;
        canvasConstraints.gridheight = 2;
        add(canvas, canvasConstraints);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
