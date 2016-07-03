package ua.in.dergachovda.money;

public class Money {
    private int value;

    public Money(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getMoney(int value) {
        if (value > this.value) return 0;
        this.value -= value;
        return value;
    }

    public void addMoney(Money money) {
        this.value += money.getValue();
    }
}
