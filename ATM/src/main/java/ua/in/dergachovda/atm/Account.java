package ua.in.dergachovda.atm;

public class Account {
    private Person person;
    private Card card;
    private Money amount;
    private long lastNumber = 516800000000000L;

    public Account(Person person, Money money) {
        this.card = createCard(person, this);
        this.amount.addMoney(money);
        person.setCard(this.card);
        this.person = person;
    }

    private Card createCard(Person person, Account acct) {
        Card card = new Card(person, acct, nextNumber(), 3);
        return card;
    }

    private long nextNumber() {
        return lastNumber + 1;
    }
}
