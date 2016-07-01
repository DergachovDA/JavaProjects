package ua.in.dergachovda.atm.gui;

import ua.in.dergachovda.atm.*;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainForm extends JFrame {

    private JLabel label;
    private JTextArea textArea;
    private Person curentPerson;
    private ATM atm;

    public MainForm(ATM atm, List<Person> persons) {
        super("ATM");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);

        label = new JLabel("ATM - " + atm.getBank().getName());
        Dimension lableSize = label.getPreferredSize();
        lableSize.width = 500;
        lableSize.height = 25;
        label.setPreferredSize(lableSize);

        textArea = new JTextArea();
        Dimension textAriaSize = textArea.getPreferredSize();
        textAriaSize.width = 100;
        textAriaSize.height = 100;
        textArea.setPreferredSize(textAriaSize);

        LeftButtonPanel LBPanel = new LeftButtonPanel();
        RightButtonPanel RBPanel = new RightButtonPanel();
        Toolbar toolbar = new Toolbar(atm, persons, textArea);

        add(label, BorderLayout.NORTH);
        add(LBPanel, BorderLayout.WEST);
        add(textArea, BorderLayout.CENTER);
        add(RBPanel, BorderLayout.EAST);
        add(toolbar, BorderLayout.SOUTH);
    }


}
