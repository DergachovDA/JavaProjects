package ua.in.dergachovda.atm.gui;

import ua.in.dergachovda.atm.*;
import javax.swing.*;
import java.awt.*;

public class GridForm extends JPanel {
    public GridForm(ATM atm, Person person) {

        Dimension size = new Dimension();
        size.width = 100;
        size.height = 100;

        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);
        GridBagConstraints gc = new GridBagConstraints();

        JLabel label = new JLabel("insert card");
        Dimension lableSize = label.getPreferredSize();
        lableSize.width = 100;
        lableSize.height = 300;
        label.setPreferredSize(lableSize);
        gc.gridx = 2;
        gc.gridy = 2;
        add(label, gc);


        JButton button1 = new JButton();
        button1.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 1;
        button1.setName("1");
        button1.setText("1");
        add(button1, gc);

        JButton button2 = new JButton();
        button2.setPreferredSize(size);
        gc.gridx = 3;
        gc.gridy = 1;
        button2.setName("2");
        button2.setText("2");
        add(button2, gc);

        JButton button3 = new JButton();
        button3.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 2;
        button3.setName("3");
        button3.setText("3");
        add(button3, gc);

        JButton button4 = new JButton();
        button4.setPreferredSize(size);
        gc.gridx = 3;
        gc.gridy = 2;
        button4.setName("4");
        button4.setText("4");
        add(button4, gc);

        JButton button5 = new JButton();
        button5.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 3;
        button5.setName("5");
        button5.setText("5");
        add(button5, gc);

        JButton button6 = new JButton();
        button6.setPreferredSize(size);
        gc.gridx = 3;
        gc.gridy = 3;
        button6.setName("6");
        button6.setText("6");
        add(button6, gc);
    }
}
