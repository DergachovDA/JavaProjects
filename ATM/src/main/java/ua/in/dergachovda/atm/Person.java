package ua.in.dergachovda.atm;

public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private Money cash;
    private Card card;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public boolean setCard(Card card) {
        if (this.card != null)
            return false;
        this.card = card;
        return true;
    }

    public Money getAllCash() {
        return cash;
    }

    public void addCash(Money cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}
