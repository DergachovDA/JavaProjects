package ua.in.dergachovda.atm;

public class Account {
    private Person person;
    private Card card;
    private Security security;
    private Money amount;
    private int lastNumber = 1;

    public Account(Person person, Money money) {
        card = createCard(person, this);
        amount = new Money(money.getValue());
        person.setCard(card);
        this.person = person;
    }

    private Card createCard(Person person, Account acct) {
        Card card = new Card(person, acct, nextNumber());
        security = new Security(card);
        return card;
    }

    private int nextNumber() {
        return lastNumber + 1;
    }
}
