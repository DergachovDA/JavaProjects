package ua.in.dergachovda.atm;

public class ATMFirst implements ATM{

    private Money amountOfMoney;
    private Bank bank;

    public ATMFirst(Bank bank) {
        this.bank = bank;
    }

    public Money getMoney() {
        return amountOfMoney;
    }

    public void addMoney(Money money) {
        this.amountOfMoney.addMoney(money);
    }

    public void addMoney(Currency... args) {
        for (int i = 0; i < args.length; i++) {
            this.amountOfMoney.addMoney(args[i]);
        }
    }

    public boolean readCard(Card card) {
        return false;
    }
}
