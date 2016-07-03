package ua.in.dergachovda.bank;

import ua.in.dergachovda.money.Money;
import ua.in.dergachovda.Person;

public interface Bank {
    public void createAccount(Person person, Money money);
    public String getName();
}
