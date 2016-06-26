package ua.in.dergachovda.atm;

import java.util.Date;

public class Card {
    private Person person;
    private Account acct;
    private long number;
    private Date expiresEnd;

    public Card(Person person, Account acct, long number, int years) {
        this.person = person;
        this.acct = acct;
        this.number = number;
        this.expiresEnd.setTime(new Date().getTime() + 31536000000L * years);
    }
}
