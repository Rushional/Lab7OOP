package Interface;

import Model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ControlPanel extends JPanel {
    private Model model;
    private Canvas canvas;
    private int coordinateX, coordinateY;
    private int horizontalPointsAmount, verticalPointsAmount;
    private int circleRadius = 75;
    private int ellipseSemiMajorX = 80, ellipseSemiMinorY = 40;
    private int rectangleLength = 200, rectangleHeight = 80;
    private int squareSide = 95;
//    private boolean isCircle = true, isEllipse = false, isRectangle = false, isSquare = false;
//    private boolean isGrid = false;

    ControlPanel(Model model, Canvas canvas) {
        super();
        this.model = model;
        this.canvas = canvas;
        coordinateX = 400;
        coordinateY = 300;
        horizontalPointsAmount = 41;
        verticalPointsAmount = 21;
        //        setBackground(new Color(116, 255, 207));
        setBackground(new Color(235, 240, 255));
        setPreferredSize(new Dimension(300, 400));
        setLayout(new GridBagLayout());


        JLabel labelIsGrid = new JLabel("Use grid method:");
        GridBagConstraints labelIsGridConstraints = new GridBagConstraints();
        labelIsGridConstraints.anchor = GridBagConstraints.WEST;
        labelIsGridConstraints.insets.left = 10;
        labelIsGridConstraints.insets.top = 10;
        labelIsGridConstraints.fill = GridBagConstraints.NONE;
        labelIsGridConstraints.weightx = 0;
        labelIsGridConstraints.weighty = 0;
        labelIsGridConstraints.gridx = 0;
        labelIsGridConstraints.gridy = 0;
        labelIsGridConstraints.gridwidth = 3;
        add(labelIsGrid, labelIsGridConstraints);

        JRadioButton radioGrid = new JRadioButton();
        radioGrid.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioGridConstraints = new GridBagConstraints();
        radioGridConstraints.insets.top = 10;
        radioGridConstraints.fill = GridBagConstraints.NONE;
        radioGridConstraints.weightx = 0;
        radioGridConstraints.weighty = 0;
        radioGridConstraints.gridx = 3;
        radioGridConstraints.gridy = 0;
//        radioGridConstraints.gridwidth = 1;
        add(radioGrid, radioGridConstraints);

        JLabel labelIsRandom = new JLabel("Use random method:");
        GridBagConstraints labelIsRandomConstraints = new GridBagConstraints();
        labelIsRandomConstraints.anchor = GridBagConstraints.WEST;
        labelIsRandomConstraints.insets.left = 10;
        labelIsRandomConstraints.insets.top = 10;
        labelIsRandomConstraints.fill = GridBagConstraints.NONE;
        labelIsRandomConstraints.weightx = 0;
        labelIsRandomConstraints.weighty = 0;
        labelIsRandomConstraints.gridx = 0;
        labelIsRandomConstraints.gridy = 1;
        labelIsRandomConstraints.gridwidth = 3;
        add(labelIsRandom, labelIsRandomConstraints);

        JRadioButton radioRandom = new JRadioButton();
        radioRandom.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioRandomConstraints = new GridBagConstraints();
        radioRandomConstraints.insets.top = 10;
        radioRandomConstraints.fill = GridBagConstraints.NONE;
        radioRandomConstraints.weightx = 0;
        radioRandomConstraints.weighty = 0;
        radioRandomConstraints.gridx = 3;
        radioRandomConstraints.gridy = 1;
//        radioRandomConstraints.gridwidth = 1;
        add(radioRandom, radioRandomConstraints);



        JLabel labelEnterCoordinates = new JLabel("Please enter the center point's coordinates: ");
        GridBagConstraints enterCoordinatesConstraints = new GridBagConstraints();
        enterCoordinatesConstraints.fill = GridBagConstraints.NONE;
        enterCoordinatesConstraints.insets.top = 10;
        enterCoordinatesConstraints.weightx = 0;
        enterCoordinatesConstraints.weighty = 0;
        enterCoordinatesConstraints.gridx = 0;
        enterCoordinatesConstraints.gridy = 2;
        enterCoordinatesConstraints.gridwidth = 4;
        add(labelEnterCoordinates, enterCoordinatesConstraints);
        JLabel labelX = new JLabel("X: ");
        GridBagConstraints labelXConstraints = new GridBagConstraints();
        labelXConstraints.insets.top = 10;
        labelXConstraints.insets.left = 10;
        labelXConstraints.weightx = 0;
        labelXConstraints.weighty = 0;
        labelXConstraints.gridx = 0;
        labelXConstraints.gridy = 3;
        add(labelX, labelXConstraints);
        JTextField textX = new JTextField(7);
        textX.setText("400");
//        textX.setBorder(BorderFactory.createEmptyBorder());
        textX.setMinimumSize(textX.getPreferredSize());
        GridBagConstraints textXConstraints = new GridBagConstraints();
        textXConstraints.anchor = GridBagConstraints.WEST;
        textXConstraints.insets.top = 10;
        textXConstraints.weightx = 0;
        textXConstraints.weighty = 0;
        textXConstraints.gridx = 1;
        textXConstraints.gridy = 3;
        add(textX, textXConstraints);
        JLabel labelY = new JLabel("Y: ");
        GridBagConstraints labelYConstraints = new GridBagConstraints();
        labelYConstraints.insets.top = 10;
        labelYConstraints.insets.left = 20;
        labelYConstraints.weightx = 0;
        labelYConstraints.weighty = 0;
        labelYConstraints.gridx = 2;
        labelYConstraints.gridy = 3;
        add(labelY, labelYConstraints);
        JTextField textY = new JTextField(7);
        textY.setText("300");
//        textY.setBorder(BorderFactory.createEmptyBorder());
        textY.setMinimumSize(textX.getPreferredSize());
        GridBagConstraints textYConstraints = new GridBagConstraints();
        textYConstraints.anchor = GridBagConstraints.WEST;
        textYConstraints.insets.top = 10;
        textYConstraints.weightx = 0;
        textYConstraints.weighty = 0;
        textYConstraints.gridx = 3;
        textYConstraints.gridy = 3;
        add(textY, textYConstraints);
        JLabel labelIsCircle = new JLabel("A circle:");
        GridBagConstraints labelIsCircleConstraints = new GridBagConstraints();
        labelIsCircleConstraints.anchor = GridBagConstraints.WEST;
        labelIsCircleConstraints.insets.left = 10;
        labelIsCircleConstraints.insets.top = 10;
        labelIsCircleConstraints.fill = GridBagConstraints.NONE;
        labelIsCircleConstraints.weightx = 0;
        labelIsCircleConstraints.weighty = 0;
        labelIsCircleConstraints.gridx = 0;
        labelIsCircleConstraints.gridy = 4;
        labelIsCircleConstraints.gridwidth = 3;
        add(labelIsCircle, labelIsCircleConstraints);

        JRadioButton radioCircle = new JRadioButton();
        radioCircle.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioCircleConstraints = new GridBagConstraints();
        radioCircleConstraints.insets.top = 10;
        radioCircleConstraints.fill = GridBagConstraints.NONE;
        radioCircleConstraints.weightx = 0;
        radioCircleConstraints.weighty = 0;
        radioCircleConstraints.gridx = 3;
        radioCircleConstraints.gridy = 4;
//        radioCircleConstraints.gridwidth = 1;
        add(radioCircle, radioCircleConstraints);

        JLabel labelIsEllipse = new JLabel("An ellipse:");
        GridBagConstraints labelIsEllipseConstraints = new GridBagConstraints();
        labelIsEllipseConstraints.anchor = GridBagConstraints.WEST;
        labelIsEllipseConstraints.insets.left = 10;
        labelIsEllipseConstraints.insets.top = 10;
        labelIsEllipseConstraints.fill = GridBagConstraints.NONE;
        labelIsEllipseConstraints.weightx = 0;
        labelIsEllipseConstraints.weighty = 0;
        labelIsEllipseConstraints.gridx = 0;
        labelIsEllipseConstraints.gridy = 5;
        labelIsEllipseConstraints.gridwidth = 3;
        add(labelIsEllipse, labelIsEllipseConstraints);

        JRadioButton radioEllipse = new JRadioButton();
        radioEllipse.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioEllipseConstraints = new GridBagConstraints();
        radioEllipseConstraints.insets.top = 10;
        radioEllipseConstraints.fill = GridBagConstraints.NONE;
        radioEllipseConstraints.weightx = 0;
        radioEllipseConstraints.weighty = 0;
        radioEllipseConstraints.gridx = 3;
        radioEllipseConstraints.gridy = 5;
//        radioEllipseConstraints.gridwidth = 1;
        add(radioEllipse, radioEllipseConstraints);

        JLabel labelIsRectangle = new JLabel("A rectangle:");
        GridBagConstraints labelIsRectangleConstraints = new GridBagConstraints();
        labelIsRectangleConstraints.anchor = GridBagConstraints.WEST;
        labelIsRectangleConstraints.insets.left = 10;
        labelIsRectangleConstraints.insets.top = 10;
        labelIsRectangleConstraints.fill = GridBagConstraints.NONE;
        labelIsRectangleConstraints.weightx = 0;
        labelIsRectangleConstraints.weighty = 0;
        labelIsRectangleConstraints.gridx = 0;
        labelIsRectangleConstraints.gridy = 6;
        labelIsRectangleConstraints.gridwidth = 3;
        add(labelIsRectangle, labelIsRectangleConstraints);

        JRadioButton radioRectangle = new JRadioButton();
        radioRectangle.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioRectangleConstraints = new GridBagConstraints();
        radioRectangleConstraints.insets.top = 10;
        radioRectangleConstraints.fill = GridBagConstraints.NONE;
        radioRectangleConstraints.weightx = 0;
        radioRectangleConstraints.weighty = 0;
        radioRectangleConstraints.gridx = 3;
        radioRectangleConstraints.gridy = 6;
//        radioRectangleConstraints.gridwidth = 1;
        add(radioRectangle, radioRectangleConstraints);

        JLabel labelIsSquare= new JLabel("A square:");
        GridBagConstraints labelIsSquareConstraints = new GridBagConstraints();
        labelIsSquareConstraints.anchor = GridBagConstraints.WEST;
        labelIsSquareConstraints.insets.left = 10;
        labelIsSquareConstraints.insets.top = 10;
        labelIsSquareConstraints.fill = GridBagConstraints.NONE;
        labelIsSquareConstraints.weightx = 0;
        labelIsSquareConstraints.weighty = 0;
        labelIsSquareConstraints.gridx = 0;
        labelIsSquareConstraints.gridy = 7;
        labelIsSquareConstraints.gridwidth = 3;
        add(labelIsSquare, labelIsSquareConstraints);

        JRadioButton radioSquare = new JRadioButton();
        radioSquare.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioSquareConstraints = new GridBagConstraints();
        radioSquareConstraints.insets.top = 10;
        radioSquareConstraints.fill = GridBagConstraints.NONE;
        radioSquareConstraints.weightx = 0;
        radioSquareConstraints.weighty = 0;
        radioSquareConstraints.gridx = 3;
        radioSquareConstraints.gridy = 7;
//        radioSquareConstraints.gridwidth = 1;
        add(radioSquare, radioSquareConstraints);

        JLabel labelHorizontalAmount = new JLabel("Horizontal points amount: ");
        GridBagConstraints labelHorizontalAmountConstraints = new GridBagConstraints();
        labelHorizontalAmountConstraints.insets.top = 10;
        labelHorizontalAmountConstraints.insets.left = 10;
        labelHorizontalAmountConstraints.weightx = 0;
        labelHorizontalAmountConstraints.weighty = 0;
        labelHorizontalAmountConstraints.gridx = 0;
        labelHorizontalAmountConstraints.gridy = 8;
        labelHorizontalAmountConstraints.gridwidth = 2;
        add(labelHorizontalAmount, labelHorizontalAmountConstraints);
        JTextField textHorizontalAmount = new JTextField(7);
        textHorizontalAmount.setText("41");
//        textHorizontalAmount.setBorder(BorderFactory.createEmptyBorder());
        textHorizontalAmount.setMinimumSize(textHorizontalAmount.getPreferredSize());
        GridBagConstraints textHorizontalAmountConstraints = new GridBagConstraints();
        textHorizontalAmountConstraints.anchor = GridBagConstraints.WEST;
        textHorizontalAmountConstraints.insets.top = 10;
        textHorizontalAmountConstraints.weightx = 0;
        textHorizontalAmountConstraints.weighty = 0;
        textHorizontalAmountConstraints.gridx = 2;
        textHorizontalAmountConstraints.gridy = 8;
        add(textHorizontalAmount, textHorizontalAmountConstraints);

        JLabel labelVerticalAmount = new JLabel("Vertical points amount: ");
        GridBagConstraints labelVerticalAmountConstraints = new GridBagConstraints();
        labelVerticalAmountConstraints.insets.top = 10;
        labelVerticalAmountConstraints.insets.left = 10;
        labelVerticalAmountConstraints.weightx = 0;
        labelVerticalAmountConstraints.weighty = 0;
        labelVerticalAmountConstraints.gridx = 0;
        labelVerticalAmountConstraints.gridy = 9;
        labelVerticalAmountConstraints.gridwidth = 2;
        add(labelVerticalAmount, labelVerticalAmountConstraints);
        JTextField textVerticalAmount = new JTextField(7);
        textVerticalAmount.setText("21");
//        textVerticalAmount.setBorder(BorderFactory.createEmptyBorder());
        textVerticalAmount.setMinimumSize(textVerticalAmount.getPreferredSize());
        GridBagConstraints textVerticalAmountConstraints = new GridBagConstraints();
        textVerticalAmountConstraints.anchor = GridBagConstraints.WEST;
        textVerticalAmountConstraints.insets.top = 10;
        textVerticalAmountConstraints.weightx = 0;
        textVerticalAmountConstraints.weighty = 0;
        textVerticalAmountConstraints.gridx = 2;
        textVerticalAmountConstraints.gridy = 9;
        add(textVerticalAmount, textVerticalAmountConstraints);

        JLabel labelGridArea = new JLabel("Grid method area: " + model.getCurrentSolution().getValues().getGridArea());
        GridBagConstraints gridAreaConstraints = new GridBagConstraints();
        gridAreaConstraints.fill = GridBagConstraints.NONE;
        gridAreaConstraints.insets.top = 10;
        gridAreaConstraints.weightx = 0;
        gridAreaConstraints.weighty = 0;
        gridAreaConstraints.gridx = 0;
        gridAreaConstraints.gridy = 10;
        gridAreaConstraints.gridwidth = 4;
        add(labelGridArea, gridAreaConstraints);

        JLabel labelRandomArea = new JLabel("Random method area: " + model.getCurrentSolution().getValues().getRandomArea());
        GridBagConstraints randomAreaConstraints = new GridBagConstraints();
        randomAreaConstraints.fill = GridBagConstraints.NONE;
        randomAreaConstraints.insets.top = 10;
        randomAreaConstraints.weightx = 0;
        randomAreaConstraints.weighty = 0;
        randomAreaConstraints.gridx = 0;
        randomAreaConstraints.gridy = 11;
        randomAreaConstraints.gridwidth = 4;
        add(labelRandomArea, randomAreaConstraints);

        ButtonGroup radioGroupFigure = new ButtonGroup();
        radioGroupFigure.add(radioCircle);
        radioGroupFigure.add(radioEllipse);
        radioGroupFigure.add(radioRectangle);
        radioGroupFigure.add(radioSquare);
        radioCircle.setSelected(true);

        ButtonGroup radioGroupMethod = new ButtonGroup();
        radioGroupMethod.add(radioGrid);
        radioGroupMethod.add(radioRandom);
        radioGrid.setSelected(true);
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

        textX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coordinateX = Integer.parseInt(textX.getText());
                model.moveFigure(coordinateX, coordinateY);
            }
        });
        textY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coordinateY = Integer.parseInt(textY.getText());
                model.moveFigure(coordinateX, coordinateY);
            }
        });


        radioGrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setGrid(true);
                canvas.repaint();
            }
        });
        radioRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setGrid(false);
                canvas.repaint();
            }
        });


        radioCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setCircle(true);
                model.setEllipse(false);
                model.setRectangle(false);
                model.setSquare(false);
                model.replaceWithCircle(coordinateX, coordinateY, circleRadius, horizontalPointsAmount, verticalPointsAmount);
                canvas.repaint();
//                isCircle = true;
//                isEllipse = false;
//                isRectangle = false;
//                isSquare = false;
            }
        });
        radioEllipse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setEllipse(true);
                model.setCircle(false);
                model.setRectangle(false);
                model.setSquare(false);
                model.replaceWithEllipse(coordinateX, coordinateY, ellipseSemiMajorX, ellipseSemiMinorY, horizontalPointsAmount, verticalPointsAmount);
                canvas.repaint();
//                isEllipse = true;
//                isCircle = false;
//                isRectangle = false;
//                isSquare = false;
            }
        });
        radioRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setRectangle(true);
                model.setCircle(false);
                model.setEllipse(false);
                model.setSquare(false);
                model.replaceWithRectangle(coordinateX, coordinateY, rectangleLength, rectangleHeight, horizontalPointsAmount, verticalPointsAmount);
                canvas.repaint();
//                isRectangle = true;
//                isCircle = false;
//                isEllipse = false;
//                isSquare = false;
            }
        });
        radioSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setSquare(true);
                model.setCircle(false);
                model.setEllipse(false);
                model.setRectangle(false);
                model.replaceWithSquare(coordinateX, coordinateY, squareSide, horizontalPointsAmount, verticalPointsAmount);
                canvas.repaint();
//                isSquare = true;
//                isRectangle = false;
//                isCircle = false;
//                isEllipse = false;
            }
        });



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

//    public boolean isGrid() {
//        return isGrid;
//    }
}
