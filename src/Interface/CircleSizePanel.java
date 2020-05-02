package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleSizePanel extends SizePanel {
    public CircleSizePanel(ControlPanel controlPanel) {
        super(controlPanel);
        setBackground(new Color(102, 255, 159));
        setLayout(new GridBagLayout());
        JLabel labelEnterRadius = new JLabel("Circle's radius: ");
        GridBagConstraints enterRadiusConstraints = new GridBagConstraints();
        enterRadiusConstraints.anchor = GridBagConstraints.NORTHWEST;
        enterRadiusConstraints.fill = GridBagConstraints.NONE;
        enterRadiusConstraints.insets.top = 10;
        enterRadiusConstraints.insets.left = 20;
        enterRadiusConstraints.weightx = 1;
        enterRadiusConstraints.weighty = 1;
        enterRadiusConstraints.gridx = 0;
        enterRadiusConstraints.gridy = 0;
        add(labelEnterRadius, enterRadiusConstraints);

        JTextField textRadius = new JTextField(7);
        textRadius.setText("100");
//        textRadius.setBorder(BorderFactory.createEmptyBorder());
        textRadius.setMinimumSize(textRadius.getPreferredSize());
        GridBagConstraints textRadiusConstraints = new GridBagConstraints();
        textRadiusConstraints.anchor = GridBagConstraints.NORTHWEST;
        textRadiusConstraints.insets.top = 10;
        textRadiusConstraints.weightx = 10;
        textRadiusConstraints.weighty = 1;
        textRadiusConstraints.gridx = 1;
        textRadiusConstraints.gridy = 0;
        add(textRadius, textRadiusConstraints);

        textRadius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int radius = Integer.parseInt(textRadius.getText());
                controlPanel.setCircleRadius(radius);
            }
        });
    }
}
