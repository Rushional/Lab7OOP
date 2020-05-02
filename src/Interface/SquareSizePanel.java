package Interface;

import javax.swing.*;
import java.awt.*;

public class SquareSizePanel extends SizePanel {
    public SquareSizePanel(ControlPanel controlPanel) {
        super(controlPanel);
        setLayout(new GridBagLayout());
        JLabel labelEnterSide = new JLabel("Square's side: ");
        GridBagConstraints enterSideConstraints = new GridBagConstraints();
        enterSideConstraints.anchor = GridBagConstraints.NORTHWEST;
        enterSideConstraints.fill = GridBagConstraints.NONE;
        enterSideConstraints.insets.top = 10;
        enterSideConstraints.insets.left = 20;
        enterSideConstraints.weightx = 1;
        enterSideConstraints.weighty = 1;
        enterSideConstraints.gridx = 0;
        enterSideConstraints.gridy = 0;
        add(labelEnterSide, enterSideConstraints);

        JTextField textSide = new JTextField(7);
//        textSide.setBorder(BorderFactory.createEmptyBorder());
        textSide.setMinimumSize(textSide.getPreferredSize());
        GridBagConstraints textSideConstraints = new GridBagConstraints();
        textSideConstraints.anchor = GridBagConstraints.NORTHWEST;
        textSideConstraints.insets.top = 10;
        textSideConstraints.weightx = 10;
        textSideConstraints.weighty = 1;
        textSideConstraints.gridx = 1;
        textSideConstraints.gridy = 0;
        add(textSide, textSideConstraints);
    }
}
