package ua.in.dergachovda.bank.first;

import ua.in.dergachovda.bank.Account;
import ua.in.dergachovda.bank.Pin;
import ua.in.dergachovda.bank.Security;
import ua.in.dergachovda.cards.Card;
import ua.in.dergachovda.money.Money;
import ua.in.dergachovda.Person;

public class AccountFirst implements Account{
    private Person person;
    private Card card;
    private Security security;
    private Money amount;
    private int lastNumber = 1;

    public AccountFirst(Person person, Money money) {
        security = SecurityFirst.BASE;
        card = createCard(person, this);
        amount = new Money(money.getValue());
        person.setCard(card);
        this.person = person;
    }

    private Card createCard(Person person, AccountFirst acct) {
        Card card = new CardFirst(person, acct, nextNumber());
        security.add(card.getCardsNo(), new Pin());
        return card;
    }

    private int nextNumber() {
        return lastNumber + 1;
    }

    @Override
    public Account getAccount() {
        return this;
    }
}
