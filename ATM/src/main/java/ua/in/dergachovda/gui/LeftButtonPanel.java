package ua.in.dergachovda.gui;

import javax.swing.*;
import java.awt.*;

public class LeftButtonPanel extends JPanel {

    public LeftButtonPanel() {

        setSize(100, 300);
        Dimension size = new Dimension();
        size.width = 100;
        size.height = 100;

        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);
        GridBagConstraints gc = new GridBagConstraints();

        JButton button1 = new JButton();
        button1.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 1;
        button1.setName("1");
        button1.setText("1");
        add(button1, gc);

        JButton button3 = new JButton();
        button3.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 2;
        button3.setName("3");
        button3.setText("3");
        add(button3, gc);

        JButton button5 = new JButton();
        button5.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 3;
        button5.setName("5");
        button5.setText("5");
        add(button5, gc);
    }
}
