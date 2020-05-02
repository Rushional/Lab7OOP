package Interface;

import Model.Model;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private Canvas canvas; //probably won't need later

    Window(Model model) {
        super("OOP Lab7");
        setLayout(new GridBagLayout());
        canvas = new Canvas(model);
        ControlPanel controlPanel = new ControlPanel(model, canvas);
        CircleSizePanel circleSizePanel = new CircleSizePanel(controlPanel);
        GridBagConstraints inputPanelConstraints = new GridBagConstraints();
        inputPanelConstraints.fill = GridBagConstraints.NONE;
        inputPanelConstraints.weightx = 0;
        inputPanelConstraints.weighty = 0;
        inputPanelConstraints.gridx = 0;
        inputPanelConstraints.gridy = 0;
        add(controlPanel, inputPanelConstraints);
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

    public Canvas getCanvas() {
        return canvas;
    }
}
