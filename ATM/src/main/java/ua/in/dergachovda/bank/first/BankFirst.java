package ua.in.dergachovda.bank.first;

import ua.in.dergachovda.bank.Account;
import ua.in.dergachovda.bank.Bank;
import ua.in.dergachovda.money.Money;
import ua.in.dergachovda.Person;
import java.util.ArrayList;

public class BankFirst implements Bank {
    private String name;
    private ArrayList<Account> accounts;
    private SecurityFirst security;

    public BankFirst(String name) {
        this.name = name;
        accounts = new ArrayList<>();
        security = SecurityFirst.BASE;
    }

    public void createAccount(Person person, Money money) {
        Account account = new AccountFirst(person, money);
        accounts.add(account);
    }

    @Override
    public String getName() {
        return name;
    }
}
