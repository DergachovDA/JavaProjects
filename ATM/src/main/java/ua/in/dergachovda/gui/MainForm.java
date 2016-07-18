package ua.in.dergachovda.gui;

import ua.in.dergachovda.Person;
import ua.in.dergachovda.bank.ATM;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainForm extends JFrame {

    private JLabel label;
    private JTextArea screen;
    private JTextArea textArea;
    private Person curentPerson;
    private ATM atm;

    public MainForm(ATM atm, List<Person> persons) {
        super("ATM - " + atm.getBank().getName());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);
/*
//        label = new JLabel("ATM - " + atm.getBank().getName());
//        Dimension lableSize = label.getPreferredSize();
//        lableSize.width = 500;
//        lableSize.height = 25;
//        label.setPreferredSize(lableSize);

        textArea = new JTextArea();
        Dimension textAriaSize = textArea.getPreferredSize();
        textAriaSize.width = 300;
        textAriaSize.height = 150;
        textArea.setPreferredSize(textAriaSize);

        screen = new JTextArea();
        screen.setPreferredSize(textAriaSize);

//        LeftButtonPanel LBPanel = new LeftButtonPanel();
//        RightButtonPanel RBPanel = new RightButtonPanel();
        Toolbar toolbar = new Toolbar(atm, persons, screen);

//        add(label, BorderLayout.NORTH);
//        add(LBPanel, BorderLayout.WEST);
        add(screen, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
//        add(RBPanel, BorderLayout.EAST);
        add(toolbar, BorderLayout.SOUTH);
*/
        LeftPanel lPanel = new LeftPanel();
        NumPanel numPanel = new NumPanel();

        add(lPanel, BorderLayout.WEST);
        add(numPanel, BorderLayout.EAST);
    }


}
