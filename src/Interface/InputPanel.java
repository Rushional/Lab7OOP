package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class InputPanel extends JPanel {
    private int coordinateX, coordinateY;
    private int circleRadius = 75;
    private int ellipseSemiMajorX = 80, ellipseSemiMinorY = 40;
    private int rectangleLength = 200, rectangleHeight = 80;
    private boolean isSimple = true, isIsosceles = false, isEquilateral = false;

    InputPanel(Canvas canvas) {
        super();
        //        setBackground(new Color(116, 255, 207));
        setBackground(new Color(235, 240, 255));
        setPreferredSize(new Dimension(300, 300));
        setLayout(new GridBagLayout());
        JLabel labelEnterCoordinates = new JLabel("Please enter the center point's coordinates: ");
        GridBagConstraints enterCoordinatesConstraints = new GridBagConstraints();
        enterCoordinatesConstraints.fill = GridBagConstraints.NONE;
        enterCoordinatesConstraints.weightx = 0;
        enterCoordinatesConstraints.weighty = 0;
        enterCoordinatesConstraints.gridx = 0;
        enterCoordinatesConstraints.gridy = 0;
        enterCoordinatesConstraints.gridwidth = 4;
        add(labelEnterCoordinates, enterCoordinatesConstraints);
        JLabel labelX = new JLabel("X: ");
        GridBagConstraints labelXConstraints = new GridBagConstraints();
        labelXConstraints.insets.top = 20;
        labelXConstraints.insets.left = 10;
        labelXConstraints.weightx = 0;
        labelXConstraints.weighty = 0;
        labelXConstraints.gridx = 0;
        labelXConstraints.gridy = 1;
        add(labelX, labelXConstraints);
        JTextField textX = new JTextField(7);
//        textX.setBorder(BorderFactory.createEmptyBorder());
        textX.setMinimumSize(textX.getPreferredSize());
        GridBagConstraints textXConstraints = new GridBagConstraints();
        textXConstraints.anchor = GridBagConstraints.WEST;
        textXConstraints.insets.top = 20;
        textXConstraints.weightx = 0;
        textXConstraints.weighty = 0;
        textXConstraints.gridx = 1;
        textXConstraints.gridy = 1;
        add(textX, textXConstraints);
        JLabel labelY = new JLabel("Y: ");
        GridBagConstraints labelYConstraints = new GridBagConstraints();
        labelYConstraints.insets.top = 20;
        labelYConstraints.insets.left = 20;
        labelYConstraints.weightx = 0;
        labelYConstraints.weighty = 0;
        labelYConstraints.gridx = 2;
        labelYConstraints.gridy = 1;
        add(labelY, labelYConstraints);
        JTextField textY = new JTextField(7);
//        textY.setBorder(BorderFactory.createEmptyBorder());
        textY.setMinimumSize(textX.getPreferredSize());
        GridBagConstraints textYConstraints = new GridBagConstraints();
        textYConstraints.anchor = GridBagConstraints.WEST;
        textYConstraints.insets.top = 20;
        textYConstraints.weightx = 0;
        textYConstraints.weighty = 0;
        textYConstraints.gridx = 3;
        textYConstraints.gridy = 1;
        add(textY, textYConstraints);
        JLabel labelIsCircle = new JLabel("A circle:");
        GridBagConstraints labelIsCircleConstraints = new GridBagConstraints();
        labelIsCircleConstraints.anchor = GridBagConstraints.WEST;
        labelIsCircleConstraints.insets.left = 10;
        labelIsCircleConstraints.insets.top = 20;
        labelIsCircleConstraints.fill = GridBagConstraints.NONE;
        labelIsCircleConstraints.weightx = 0;
        labelIsCircleConstraints.weighty = 0;
        labelIsCircleConstraints.gridx = 0;
        labelIsCircleConstraints.gridy = 2;
        labelIsCircleConstraints.gridwidth = 3;
        add(labelIsCircle, labelIsCircleConstraints);

        JRadioButton radioCircle = new JRadioButton();
        radioCircle.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioCircleConstraints = new GridBagConstraints();
        radioCircleConstraints.insets.top = 20;
        radioCircleConstraints.fill = GridBagConstraints.NONE;
        radioCircleConstraints.weightx = 0;
        radioCircleConstraints.weighty = 0;
        radioCircleConstraints.gridx = 3;
        radioCircleConstraints.gridy = 2;
//        radioCircleConstraints.gridwidth = 1;
        add(radioCircle, radioCircleConstraints);

        JLabel labelIsEllipse = new JLabel("An ellipse:");
        GridBagConstraints labelIsEllipseConstraints = new GridBagConstraints();
        labelIsEllipseConstraints.anchor = GridBagConstraints.WEST;
        labelIsEllipseConstraints.insets.left = 10;
        labelIsEllipseConstraints.insets.top = 20;
        labelIsEllipseConstraints.fill = GridBagConstraints.NONE;
        labelIsEllipseConstraints.weightx = 0;
        labelIsEllipseConstraints.weighty = 0;
        labelIsEllipseConstraints.gridx = 0;
        labelIsEllipseConstraints.gridy = 3;
        labelIsEllipseConstraints.gridwidth = 3;
        add(labelIsEllipse, labelIsEllipseConstraints);

        JRadioButton radioEllipse = new JRadioButton();
        radioEllipse.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioEllipseConstraints = new GridBagConstraints();
        radioEllipseConstraints.insets.top = 20;
        radioEllipseConstraints.fill = GridBagConstraints.NONE;
        radioEllipseConstraints.weightx = 0;
        radioEllipseConstraints.weighty = 0;
        radioEllipseConstraints.gridx = 3;
        radioEllipseConstraints.gridy = 3;
//        radioEllipseConstraints.gridwidth = 1;
        add(radioEllipse, radioEllipseConstraints);

        JLabel labelIsRectangle = new JLabel("A rectangle:");
        GridBagConstraints labelIsRectangleConstraints = new GridBagConstraints();
        labelIsRectangleConstraints.anchor = GridBagConstraints.WEST;
        labelIsRectangleConstraints.insets.left = 10;
        labelIsRectangleConstraints.insets.top = 20;
        labelIsRectangleConstraints.fill = GridBagConstraints.NONE;
        labelIsRectangleConstraints.weightx = 0;
        labelIsRectangleConstraints.weighty = 0;
        labelIsRectangleConstraints.gridx = 0;
        labelIsRectangleConstraints.gridy = 4;
        labelIsRectangleConstraints.gridwidth = 3;
        add(labelIsRectangle, labelIsRectangleConstraints);

        JRadioButton radioRectangle = new JRadioButton();
        radioRectangle.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioRectangleConstraints = new GridBagConstraints();
        radioRectangleConstraints.insets.top = 20;
        radioRectangleConstraints.fill = GridBagConstraints.NONE;
        radioRectangleConstraints.weightx = 0;
        radioRectangleConstraints.weighty = 0;
        radioRectangleConstraints.gridx = 3;
        radioRectangleConstraints.gridy = 4;
//        radioRectangleConstraints.gridwidth = 1;
        add(radioRectangle, radioRectangleConstraints);

        JLabel labelIsSquare= new JLabel("A square:");
        GridBagConstraints labelIsSquareConstraints = new GridBagConstraints();
        labelIsSquareConstraints.anchor = GridBagConstraints.WEST;
        labelIsSquareConstraints.insets.left = 10;
        labelIsSquareConstraints.insets.top = 20;
        labelIsSquareConstraints.fill = GridBagConstraints.NONE;
        labelIsSquareConstraints.weightx = 0;
        labelIsSquareConstraints.weighty = 0;
        labelIsSquareConstraints.gridx = 0;
        labelIsSquareConstraints.gridy = 5;
        labelIsSquareConstraints.gridwidth = 3;
        add(labelIsSquare, labelIsSquareConstraints);

        JRadioButton radioSquare = new JRadioButton();
        radioSquare.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioSquareConstraints = new GridBagConstraints();
        radioSquareConstraints.insets.top = 20;
        radioSquareConstraints.fill = GridBagConstraints.NONE;
        radioSquareConstraints.weightx = 0;
        radioSquareConstraints.weighty = 0;
        radioSquareConstraints.gridx = 3;
        radioSquareConstraints.gridy = 5;
//        radioSquareConstraints.gridwidth = 1;
        add(radioSquare, radioSquareConstraints);

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioCircle);
        radioGroup.add(radioEllipse);
        radioGroup.add(radioRectangle);
        radioGroup.add(radioSquare);
        radioCircle.setSelected(true);
//
//        JButton buttonCalculateRoots = new JButton("Draw the triangle");
//        GridBagConstraints buttonRootsConstraints = new GridBagConstraints();
//        buttonRootsConstraints.anchor = GridBagConstraints.WEST;
//        buttonRootsConstraints.insets.left = 10;
//        buttonRootsConstraints.insets.top = 20;
//        buttonRootsConstraints.weightx = 0;
//        buttonRootsConstraints.weighty = 0;
//        buttonRootsConstraints.gridx = 0;
//        buttonRootsConstraints.gridy = 6;
//        buttonRootsConstraints.gridwidth = 3;
//        add(buttonCalculateRoots, buttonRootsConstraints);
//
//        JButton buttonClear = new JButton("Clear");
//        GridBagConstraints buttonClearConstraints = new GridBagConstraints();
//        buttonClearConstraints.anchor = GridBagConstraints.WEST;
//        buttonClearConstraints.insets.left = 10;
//        buttonClearConstraints.insets.top = 20;
//        buttonClearConstraints.weightx = 0;
//        buttonClearConstraints.weighty = 0;
//        buttonClearConstraints.gridx = 0;
//        buttonClearConstraints.gridy = 7;
//        buttonClearConstraints.gridwidth = 3;
//        add(buttonClear, buttonClearConstraints);

//        textX.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                coordinateX = Integer.parseInt(textX.getText());
//            }
//        });
//        textY.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                coordinateY = Integer.parseInt(textY.getText());
//            }
//        });
//        radioSimple.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                isSimple = true;
//                isIsosceles = false;
//                isEquilateral = false;
//            }
//        });
//        radioIsosceles.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                isIsosceles = true;
//                isSimple = false;
//                isEquilateral = false;
//            }
//        });
//        radioEquilateral.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                isEquilateral = true;
//                isSimple = false;
//                isIsosceles = false;
//            }
//        });



//        buttonCalculateRoots.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (!textX.getText().equals("") && !textY.getText().equals("")) {
//                    if (isSimple) {
//                        Triangle triangleSimple = new Triangle(
//                                coordinateX, coordinateY,
//                                50, 50, 150
//                        );
//                        TriangleCoordinates simpleCoordinates = new TriangleCoordinates(triangleSimple);
//                        canvas.setCoordinatesSimple(simpleCoordinates);
//                    } else if (isIsosceles) {
//                        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(
//                                coordinateX, coordinateY,
//                                80, 50
//                        );
//                        TriangleCoordinates isoscelesCoordinates = new TriangleCoordinates(isoscelesTriangle);
//                        canvas.setCoordinatesIsosceles(isoscelesCoordinates);
//                    } else if (isEquilateral) {
//                        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(
//                                coordinateX, coordinateY,
//                                55
//                        );
//                        TriangleCoordinates equilateralCoordinates = new TriangleCoordinates(equilateralTriangle);
//                        canvas.setCoordinatesEquilateral(equilateralCoordinates);
//                    } else throw new RuntimeException();
//                }
//                canvas.repaint();
//            }
//        });
//
//        buttonClear.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                canvas.setCoordinatesSimple(null);
//                canvas.setCoordinatesIsosceles(null);
//                canvas.setCoordinatesEquilateral(null);
//                canvas.repaint();
//            }
//        });
    }
}
