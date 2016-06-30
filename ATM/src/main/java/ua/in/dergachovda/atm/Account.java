package ua.in.dergachovda.atm;

public class Account {
    private Person person;
    private Card card;
    private Money amount;
    private int lastNumber = 1;

    public Account(Person person, Money money) {
        this.person = person;
        this.card = createCard(person, this);
        this.amount.addMoney(money);
        this.person.setCard(card);
    }

    private Card createCard(Person person, Account acct) {
        Card card = new Card(person, acct, nextNumber());
        return card;
    }

    private int nextNumber() {
        return lastNumber + 1;
    }
}
