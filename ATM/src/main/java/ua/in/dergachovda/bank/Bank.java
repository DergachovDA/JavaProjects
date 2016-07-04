package ua.in.dergachovda.bank;

import ua.in.dergachovda.cards.Card;
import ua.in.dergachovda.money.Money;
import ua.in.dergachovda.Person;

public interface Bank {
    public void createAccount(Person person, Money money);
    public boolean verificationCard(Card card, String pin);
    public String getName();
}
