package ua.in.dergachovda.gui;

import ua.in.dergachovda.Person;
import ua.in.dergachovda.bank.ATM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Toolbar extends JPanel {

    public Toolbar(ATM atm, List<Person> persons, JTextArea textArea) {

        JButton buttonOk = new JButton("Ok");
        JButton buttonCancel = new JButton("Cansel");
        JButton buttonSelectCard = new JButton("Insert CARD");

        LayoutManager flowLayout = new FlowLayout();
        setLayout(flowLayout);

        add(buttonOk, flowLayout);
        add(buttonCancel, flowLayout);
        add(buttonSelectCard, flowLayout);

        buttonSelectCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atm.setCard(persons.get(0).getCard());
                textArea.setText(atm.getCurrentCard().toString());
                new PinForm(atm, textArea);
            }
        });
    }



//    public static CardFirst selectCard() {
//        SwingUtilities.invokeLater(new Runnable() {
//                    @Override
//                    public void run() {
//                        new SelectCard();
//                    }
//                });
//    }
}
