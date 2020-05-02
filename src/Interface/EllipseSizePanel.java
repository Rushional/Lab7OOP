package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EllipseSizePanel extends SizePanel {
    public EllipseSizePanel(ControlPanel controlPanel) {
        super(controlPanel);
        setBackground(new Color(224, 175, 255));
        setLayout(new GridBagLayout());
        JLabel labelEnterMajor = new JLabel("Ellipse's semi-Major axis: ");
        GridBagConstraints enterMajorConstraints = new GridBagConstraints();
        enterMajorConstraints.anchor = GridBagConstraints.NORTHWEST;
        enterMajorConstraints.fill = GridBagConstraints.NONE;
        enterMajorConstraints.insets.top = 10;
        enterMajorConstraints.insets.left = 20;
        enterMajorConstraints.weightx = 1;
        enterMajorConstraints.weighty = 1;
        enterMajorConstraints.gridx = 0;
        enterMajorConstraints.gridy = 0;
        add(labelEnterMajor, enterMajorConstraints);

        JTextField textMajor = new JTextField(7);
        textMajor.setText("80");
//        textMajor.setBorder(BorderFactory.createEmptyBorder());
        textMajor.setMinimumSize(textMajor.getPreferredSize());
        GridBagConstraints textMajorConstraints = new GridBagConstraints();
        textMajorConstraints.anchor = GridBagConstraints.NORTHWEST;
        textMajorConstraints.insets.top = 10;
        textMajorConstraints.weightx = 10;
        textMajorConstraints.weighty = 1;
        textMajorConstraints.gridx = 1;
        textMajorConstraints.gridy = 0;
        add(textMajor, textMajorConstraints);

        JLabel labelEnterMinor = new JLabel("Ellipse's semi-Minor axis: ");
        GridBagConstraints enterMinorConstraints = new GridBagConstraints();
        enterMinorConstraints.anchor = GridBagConstraints.NORTHWEST;
        enterMinorConstraints.fill = GridBagConstraints.NONE;
        enterMinorConstraints.insets.top = 10;
        enterMinorConstraints.insets.left = 20;
        enterMinorConstraints.weightx = 1;
        enterMinorConstraints.weighty = 1;
        enterMinorConstraints.gridx = 0;
        enterMinorConstraints.gridy = 1;
        add(labelEnterMinor, enterMinorConstraints);

        JTextField textMinor = new JTextField(7);
        textMinor.setText("40");
//        textMinor.setBorder(BorderFactory.createEmptyBorder());
        textMinor.setMinimumSize(textMinor.getPreferredSize());
        GridBagConstraints textMinorConstraints = new GridBagConstraints();
        textMinorConstraints.anchor = GridBagConstraints.NORTHWEST;
        textMinorConstraints.insets.top = 10;
        textMinorConstraints.weightx = 10;
        textMinorConstraints.weighty = 1;
        textMinorConstraints.gridx = 1;
        textMinorConstraints.gridy = 1;
        add(textMinor, textMinorConstraints);

        textMajor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int semiMajor = Integer.parseInt(textMajor.getText());
                controlPanel.setEllipseSemiMajorX(semiMajor);
            }
        });

        textMinor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int semiMinor = Integer.parseInt(textMinor.getText());
                controlPanel.setEllipseSemiMinorY(semiMinor);
            }
        });
    }
}
