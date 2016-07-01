package ua.in.dergachovda.atm.gui;

import ua.in.dergachovda.atm.*;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainForm extends JFrame {

    private JLabel label;

    private Person curentPerson;
    private ATM atm;

    public MainForm(ATM atm, List<Person> persons) {
        super("ATM");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);

        label = new JLabel("ATM - " + atm.getBank().getName());
        Dimension lableSize = label.getPreferredSize();
        lableSize.width = 300;
        lableSize.height = 25;
        label.setPreferredSize(lableSize);

        GridForm gridForm = new GridForm(atm, curentPerson);

        Toolbar toolbar = new Toolbar(atm, persons);

        add(label, BorderLayout.NORTH);
        add(gridForm, BorderLayout.CENTER);
        add(toolbar, BorderLayout.SOUTH);
    }


}
