package ua.in.dergachovda.atm;

import java.util.ArrayList;

public class BankFirst implements Bank{
    private String name;
    private ArrayList<Account> accounts;

    public BankFirst(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void createAccount(Person person, Money money) {
        Account account = new Account(person, money);
        accounts.add(account);
    }

    @Override
    public String getName() {
        return name;
    }
}
