package ua.in.dergachovda.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumPanel extends JPanel {

    String input;

    public NumPanel(JLabel labelInput, JLabel labelOutput) {
        input = "";
        setSize(180, 220);
        Dimension size = new Dimension();
        size.width = 55;
        size.height = 55;

        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);
        GridBagConstraints gc = new GridBagConstraints();

        JButton button1 = new JButton();
        button1.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 1;
        button1.setText("1");
        add(button1, gc);

        JButton button2 = new JButton();
        button2.setPreferredSize(size);
        gc.gridx = 2;
        gc.gridy = 1;
        button2.setText("2");
        add(button2, gc);

        JButton button3 = new JButton();
        button3.setPreferredSize(size);
        gc.gridx = 3;
        gc.gridy = 1;
        button3.setText("3");
        add(button3, gc);

        JButton button4 = new JButton();
        button4.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 2;
        button4.setText("4");
        add(button4, gc);

        JButton button5 = new JButton();
        button5.setPreferredSize(size);
        gc.gridx = 2;
        gc.gridy = 2;
        button5.setText("5");
        add(button5, gc);

        JButton button6 = new JButton();
        button6.setPreferredSize(size);
        gc.gridx = 3;
        gc.gridy = 2;
        button6.setText("6");
        add(button6, gc);

        JButton button7 = new JButton();
        button7.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 3;
        button7.setText("7");
        add(button7, gc);

        JButton button8 = new JButton();
        button8.setPreferredSize(size);
        gc.gridx = 2;
        gc.gridy = 3;
        button8.setText("8");
        add(button8, gc);

        JButton button9 = new JButton();
        button9.setPreferredSize(size);
        gc.gridx = 3;
        gc.gridy = 3;
        button9.setText("9");
        add(button9, gc);

        JButton buttonOK = new JButton();
        buttonOK.setPreferredSize(size);
        gc.gridx = 1;
        gc.gridy = 4;
        buttonOK.setText("OK");
        buttonOK.setForeground(Color.GREEN);
        add(buttonOK, gc);

        JButton button0 = new JButton();
        button0.setPreferredSize(size);
        gc.gridx = 2;
        gc.gridy = 4;
        button0.setText("0");
        add(button0, gc);

        JButton buttonC = new JButton();
        buttonC.setPreferredSize(size);
        gc.gridx = 3;
        gc.gridy = 4;
        buttonC.setText("C");
        buttonC.setForeground(Color.RED);
        add(buttonC, gc);
        
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += button0.getText();
                labelInput.setText(input);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += button1.getText();
                labelInput.setText(input);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += button2.getText();
                labelInput.setText(input);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += button3.getText();
                labelInput.setText(input);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += button4.getText();
                labelInput.setText(input);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += button5.getText();
                labelInput.setText(input);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += button6.getText();
                labelInput.setText(input);
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += button7.getText();
                labelInput.setText(input);
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += button8.getText();
                labelInput.setText(input);
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += button9.getText();
                labelInput.setText(input);
            }
        });

        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = "";
                labelInput.setText(input);
            }
        });

        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelOutput.setText(input);
                input = "";
                labelInput.setText(input);
            }
        });
    }
}
