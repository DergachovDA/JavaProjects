package ua.in.dergachovda.atm;

public class ATMFirst implements ATM{

    private Money amountOfMoney;
    private Bank bank;
    private Card currentCard;

    public ATMFirst(Bank bank) {
        this.bank = bank;
    }

    public Money getMoney() {
        return amountOfMoney;
    }

    public void addMoney(Money money) {
        amountOfMoney = new Money(money.getValue());
    }

    public boolean readCard(Card card) {
        return false;
    }

    @Override
    public Card getCurrentCard() {
        return currentCard;
    }

    @Override
    public boolean setCard(Card card) {
        currentCard = card;
        return true;
    }

    @Override
    public Bank getBank() {
        return bank;
    }
}
