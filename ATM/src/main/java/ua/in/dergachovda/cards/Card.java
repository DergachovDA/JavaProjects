package ua.in.dergachovda.cards;

import ua.in.dergachovda.bank.Account;
import ua.in.dergachovda.Person;

import java.sql.DatabaseMetaData;
import java.util.Date;

public interface Card {

    public ExpiresEnd getExpiresEnd();
    public Person getPerson();
    public Account getAccount();
    public CardsNo getCardsNo();
    public boolean isValid(Date date);

    @Override
    public String toString();
}