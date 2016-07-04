package ua.in.dergachovda.gui;

import ua.in.dergachovda.bank.ATM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinForm extends JFrame {

    public PinForm(ATM atm, JTextArea screen) {
        super("PIN");

        setSize(120, 120);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);

        JLabel label = new JLabel("Input PIN code:");

        JTextArea input = new JTextArea();
        Dimension inputSize = input.getPreferredSize();
        inputSize.width = 100;
        inputSize.height = 50;
        input.setPreferredSize(inputSize);

        JButton button = new JButton("Ok");

        add(label, BorderLayout.NORTH);
        add(input, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (atm.verificationCard(input.getText())) {
                    screen.setText("PIN is Ok");
                    PinForm.super.dispose();

                } else {
                    screen.setText("Error");
                }
            }
        });

    }

}
