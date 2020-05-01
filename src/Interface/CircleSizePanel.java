package Interface;

import javax.swing.*;
import java.awt.*;

public class CircleSizePanel extends SizePanel {
    public CircleSizePanel(InputPanel inputPanel) {
        super(inputPanel);
        setLayout(new GridBagLayout());
        JLabel labelEnterRadius = new JLabel("Radius: ");
        GridBagConstraints enterRadiusConstraints = new GridBagConstraints();
        enterRadiusConstraints.anchor = GridBagConstraints.NORTHWEST;
        enterRadiusConstraints.fill = GridBagConstraints.NONE;
//        enterRadiusConstraints.insets.top = 20;
        enterRadiusConstraints.insets.left = 20;
        enterRadiusConstraints.weightx = 1;
        enterRadiusConstraints.weighty = 1;
        enterRadiusConstraints.gridx = 0;
        enterRadiusConstraints.gridy = 0;
        add(labelEnterRadius, enterRadiusConstraints);

        JTextField textRadius = new JTextField(7);
//        textRadius.setBorder(BorderFactory.createEmptyBorder());
        textRadius.setMinimumSize(textRadius.getPreferredSize());
        GridBagConstraints textRadiusConstraints = new GridBagConstraints();
        textRadiusConstraints.anchor = GridBagConstraints.NORTHWEST;
        textRadiusConstraints.weightx = 10;
        textRadiusConstraints.weighty = 1;
        textRadiusConstraints.gridx = 1;
        textRadiusConstraints.gridy = 0;
        add(textRadius, textRadiusConstraints);
    }
}
