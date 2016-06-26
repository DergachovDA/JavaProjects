package ua.in.dergachovda.atm;

public class ATMSfera implements ATM{

    private Money amountOfMoney;
    private Card card;

    public Money getMoney() {
        return amountOfMoney;
    }

    public void addMoney(Money money) {
        this.amountOfMoney.addMoney(money);
    }

    public boolean readCard(Card card) {
        return false;
    }
}
