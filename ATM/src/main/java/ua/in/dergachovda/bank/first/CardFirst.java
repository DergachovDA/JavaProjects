package ua.in.dergachovda.bank.first;

import ua.in.dergachovda.Person;
import ua.in.dergachovda.bank.Account;
import ua.in.dergachovda.cards.CardsNo;
import ua.in.dergachovda.cards.ExpiresEnd;

import java.util.Date;

public class CardFirst implements ua.in.dergachovda.cards.Card {

    private static final int VALIDITY = 3;

    private Person person;
    private AccountFirst acct;
    private CardsNo cardsNo;
    private ExpiresEnd expiresEnd;


    public CardFirst(Person person, AccountFirst acct, int number) {
        this.person = person;
        this.acct = acct;
        this.cardsNo = new CardsNo(number);
        Date date = new Date();
        this.expiresEnd = new ExpiresEnd(date.getMonth(), date.getYear() + VALIDITY);
    }

    public ExpiresEnd getExpiresEnd() {
        return expiresEnd;
    }

    public Person getPerson() {
        return person;
    }

    public Account getAccount() {
        return (Account) acct;
    }

    public CardsNo getCardsNo() {
        return cardsNo;
    }

    public boolean isValid() {
        return false;
    }

    @Override
    public String toString() {
        return "Person: " + person + "\n"
                + "No: " + cardsNo;
    }
}
