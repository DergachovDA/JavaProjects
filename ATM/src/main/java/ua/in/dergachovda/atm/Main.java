package ua.in.dergachovda.atm;

import ua.in.dergachovda.atm.gui.MainForm;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new BankFirst("Firs Bank");

        Person person1 = new Person("Ivan", "Ivanov", 23);
        person1.addCash(new Money(1000));

        Person person2 = new Person("Peter", "Petrov", 21);
        person2.addCash(new Money(900));

        List<Person> persons = new LinkedList<>();
        persons.add(person1);
        persons.add(person2);

        bank.createAccount(person1, person1.getAllCash());
        bank.createAccount(person2, person2.getAllCash());

        ATM atm = new ATMFirst(bank);
        atm.addMoney(new Money(1000));

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm(atm, persons);
            }
        });
    }
}