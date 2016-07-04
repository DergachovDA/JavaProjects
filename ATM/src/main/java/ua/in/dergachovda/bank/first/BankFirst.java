package ua.in.dergachovda.bank.first;

import ua.in.dergachovda.bank.Account;
import ua.in.dergachovda.bank.Bank;
import ua.in.dergachovda.bank.Security;
import ua.in.dergachovda.cards.Card;
import ua.in.dergachovda.money.Money;
import ua.in.dergachovda.Person;
import java.util.ArrayList;

public class BankFirst implements Bank {
    private String name;
    private ArrayList<Account> accounts;
    private Security security;

    public BankFirst(String name) {
        this.name = name;
        accounts = new ArrayList<>();
        security = SecurityFirst.BASE;
    }

    @Override
    public void createAccount(Person person, Money money) {
        Account account = new AccountFirst(person, money);
        accounts.add(account);
    }

    @Override
    public boolean verificationCard(Card card, String pin) {
        return security.verification(card, pin);
    }

    @Override
    public String getName() {
        return name;
    }
}
