package ua.in.dergachovda.atm;

public class ATMSfera implements ATM{

    private Money amountOfMoney;

    public Money getMoney() {
        return amountOfMoney;
    }

    public void setMoney(Money money) {
        this.amountOfMoney.addMoney(money);
    }
}
