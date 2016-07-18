package ua.in.dergachovda.gui;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    public LeftPanel(JLabel labelInput, JLabel labelOutput) {
        setSize(180, 220);
        Dimension size = new Dimension();
        size.width = 220;
        size.height = 55;

        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);
        GridBagConstraints gc = new GridBagConstraints();

        labelOutput.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 1;
        labelOutput.setText("Insert the Card");
        add(labelOutput, gc);

        labelInput.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 2;
        labelInput.setText("");
        add(labelInput, gc);

        JButton buttonInCard = new JButton();
        buttonInCard.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 3;
        buttonInCard.setText("Insert the Card");
        add(buttonInCard, gc);

        JButton buttonOutCard = new JButton();
        buttonOutCard.setVisible(false);
        buttonOutCard.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 3;
        buttonOutCard.setText("Get the Card");
        add(buttonOutCard, gc);

        JButton buttonGetCash = new JButton();
        buttonGetCash.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 4;
        buttonGetCash.setText("---");
        add(buttonGetCash, gc);
    }
}
