package ua.in.dergachovda.atm;

public class Account {
    private Person person;
    private Card card;
    private Money amount;
    private int lastNumber = 1;

    public Account(Person person, Money money) {
        this.card = createCard(person, this);
        this.amount.addMoney(money);
<<<<<<< HEAD
        this.person.setCard(card);
=======
        person.setCard(this.card);
        this.person = person;
>>>>>>> ad3281197461b712a3564f3f88a65db8e1dbea33
    }

    private Card createCard(Person person, Account acct) {
        Card card = new Card(person, acct, nextNumber());
        return card;
    }

    private int nextNumber() {
        return lastNumber + 1;
    }
}
