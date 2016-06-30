package ua.in.dergachovda.atm;

import java.util.ArrayList;

public class BankFirst implements Bank{
    private ArrayList<Account> accounts;

    public void createAccount(Person person, Money money) {
        Account account = new Account(person, money);
        accounts.add(account);
    }
}
