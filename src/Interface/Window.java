package Interface;

import Model.Model;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private CircleSizePanel circlePanel;
    private EllipseSizePanel ellipsePanel;
    private RectangleSizePanel rectanglePanel;
    private SquareSizePanel squarePanel;
    private SizePanel currentSizePanel;
    private GridBagConstraints sizePanelConstraints;

    Window(Model model) {
        super("OOP Lab7");
        setLayout(new GridBagLayout());
        Canvas canvas = new Canvas(model);
        ControlPanel controlPanel = new ControlPanel(model, canvas, this);
        this.circlePanel = new CircleSizePanel(controlPanel);
        this.ellipsePanel = new EllipseSizePanel(controlPanel);
        this.rectanglePanel = new RectangleSizePanel(controlPanel);
        this.squarePanel = new SquareSizePanel(controlPanel);
        GridBagConstraints inputPanelConstraints = new GridBagConstraints();
        inputPanelConstraints.fill = GridBagConstraints.NONE;
        inputPanelConstraints.weightx = 0;
        inputPanelConstraints.weighty = 0;
        inputPanelConstraints.gridx = 0;
        inputPanelConstraints.gridy = 0;
        add(controlPanel, inputPanelConstraints);
        sizePanelConstraints = new GridBagConstraints();
        sizePanelConstraints.fill = GridBagConstraints.NONE;
        sizePanelConstraints.weightx = 0;
        sizePanelConstraints.weighty = 0;
        sizePanelConstraints.gridx = 0;
        sizePanelConstraints.gridy = 1;
        add(circlePanel, sizePanelConstraints);
        currentSizePanel = circlePanel;
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

    public void switchToCircle() {
        getContentPane().remove(currentSizePanel);
        currentSizePanel = circlePanel;
        add(circlePanel, sizePanelConstraints);
        circlePanel.repaint();
    }

    public void switchToEllipse() {
        getContentPane().remove(currentSizePanel);
        currentSizePanel = ellipsePanel;
        add(ellipsePanel, sizePanelConstraints);
        ellipsePanel.repaint();
    }

    public void switchToRectangle() {
        getContentPane().remove(currentSizePanel);
        currentSizePanel = rectanglePanel;
        add(rectanglePanel, sizePanelConstraints);
        rectanglePanel.repaint();
    }

    public void switchToSquare() {
        getContentPane().remove(currentSizePanel);
        currentSizePanel = squarePanel;
        add(squarePanel, sizePanelConstraints);
        squarePanel.repaint();
    }
}
