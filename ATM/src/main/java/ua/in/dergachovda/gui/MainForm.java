package ua.in.dergachovda.gui;

import ua.in.dergachovda.Person;
import ua.in.dergachovda.bank.ATM;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainForm extends JFrame {

    private JLabel labelInput;
    private JLabel labelOutput;
    private Person curentPerson;
    private ATM atm;

    public MainForm(ATM atm, List<Person> persons) {
        super("ATM - " + atm.getBank().getName());

        JLabel labelOutput = new JLabel();
        JLabel labelInput = new JLabel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);

        LeftPanel lPanel = new LeftPanel(labelInput, labelOutput);
        NumPanel numPanel = new NumPanel(labelInput, labelOutput);

        add(lPanel, BorderLayout.WEST);
        add(numPanel, BorderLayout.EAST);
    }


}
