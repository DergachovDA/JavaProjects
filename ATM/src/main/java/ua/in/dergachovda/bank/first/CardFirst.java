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
    @Override
    public ExpiresEnd getExpiresEnd() {
        return expiresEnd;
    }
    @Override
    public Person getPerson() {
        return person;
    }
    @Override
    public Account getAccount() {
        return (Account) acct;
    }
    @Override
    public CardsNo getCardsNo() {
        return cardsNo;
    }
    @Override
    public boolean isValid(Date date) {
        if (date.getYear() < this.getExpiresEnd().getYear()) {
            return true;
        } else {
            if (date.getYear() == this.getExpiresEnd().getYear()) {
                return date.getMonth() <= this.getExpiresEnd().getMonth();
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person: " + person + "\n"
                + "No: " + cardsNo;
    }
}
