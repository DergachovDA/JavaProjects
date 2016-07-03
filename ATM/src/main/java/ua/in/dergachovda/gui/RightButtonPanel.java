package ua.in.dergachovda.gui;

import javax.swing.*;
import java.awt.*;

public class RightButtonPanel extends JPanel {

    public RightButtonPanel() {

        setSize(100, 300);
        Dimension size = new Dimension();
        size.width = 100;
        size.height = 100;

        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);
        GridBagConstraints gc = new GridBagConstraints();

        JButton button2 = new JButton();
        button2.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 1;
        button2.setName("2");
        button2.setText("2");
        add(button2, gc);

        JButton button4 = new JButton();
        button4.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 2;
        button4.setName("4");
        button4.setText("4");
        add(button4, gc);

        JButton button6 = new JButton();
        button6.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 3;
        button6.setName("6");
        button6.setText("6");
        add(button6, gc);
    }
}
