package ua.in.dergachovda.cards;

import ua.in.dergachovda.bank.Account;
import ua.in.dergachovda.Person;

public interface Card {

    public ExpiresEnd getExpiresEnd();
    public Person getPerson();
    public Account getAccount();
    public CardsNo getCardsNo();
    public boolean isValid();

    @Override
    public String toString();
}