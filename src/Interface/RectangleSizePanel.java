package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleSizePanel extends SizePanel {
    public RectangleSizePanel(ControlPanel controlPanel) {
        super(controlPanel);
        setBackground(new Color(213, 223, 255));
        setLayout(new GridBagLayout());
        JLabel labelEnterLength = new JLabel("Rectangle's length: ");
        GridBagConstraints enterLengthConstraints = new GridBagConstraints();
        enterLengthConstraints.anchor = GridBagConstraints.NORTHWEST;
        enterLengthConstraints.fill = GridBagConstraints.NONE;
        enterLengthConstraints.insets.top = 10;
        enterLengthConstraints.insets.left = 20;
        enterLengthConstraints.weightx = 1;
        enterLengthConstraints.weighty = 1;
        enterLengthConstraints.gridx = 0;
        enterLengthConstraints.gridy = 0;
        add(labelEnterLength, enterLengthConstraints);

        JTextField textLength = new JTextField(7);
        textLength.setText("200");
//        textLength.setBorder(BorderFactory.createEmptyBorder());
        textLength.setMinimumSize(textLength.getPreferredSize());
        GridBagConstraints textLengthConstraints = new GridBagConstraints();
        textLengthConstraints.anchor = GridBagConstraints.NORTHWEST;
        textLengthConstraints.insets.top = 10;
        textLengthConstraints.weightx = 10;
        textLengthConstraints.weighty = 1;
        textLengthConstraints.gridx = 1;
        textLengthConstraints.gridy = 0;
        add(textLength, textLengthConstraints);

        JLabel labelEnterHeight = new JLabel("Rectangle's height: ");
        GridBagConstraints enterHeightConstraints = new GridBagConstraints();
        enterHeightConstraints.anchor = GridBagConstraints.NORTHWEST;
        enterHeightConstraints.fill = GridBagConstraints.NONE;
        enterHeightConstraints.insets.top = 10;
        enterHeightConstraints.insets.left = 20;
        enterHeightConstraints.weightx = 1;
        enterHeightConstraints.weighty = 1;
        enterHeightConstraints.gridx = 0;
        enterHeightConstraints.gridy = 1;
        add(labelEnterHeight, enterHeightConstraints);

        JTextField textHeight = new JTextField(7);
        textHeight.setText("80");
//        textHeight.setBorder(BorderFactory.createEmptyBorder());
        textHeight.setMinimumSize(textHeight.getPreferredSize());
        GridBagConstraints textHeightConstraints = new GridBagConstraints();
        textHeightConstraints.anchor = GridBagConstraints.NORTHWEST;
        textHeightConstraints.insets.top = 10;
        textHeightConstraints.weightx = 10;
        textHeightConstraints.weighty = 1;
        textHeightConstraints.gridx = 1;
        textHeightConstraints.gridy = 1;
        add(textHeight, textHeightConstraints);

        textLength.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = Integer.parseInt(textLength.getText());
                controlPanel.setRectangleLength(length);
            }
        });

        textHeight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int height = Integer.parseInt(textHeight.getText());
                controlPanel.setRectangleHeight(height);
            }
        });
    }
}
