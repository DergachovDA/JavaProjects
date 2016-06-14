package ua.in.dergachovda.atm;

import ua.in.dergachovda.atm.exception.NotEnoughFundsException;

public class Money {
    /*
    public static final int ONE = 1;
    public static final int TOW = 2;
    public static final int FIVE = 5;
    public static final int TEN = 10;
    public static final int TWENTY = 20;
    public static final int FIFTY = 50;
    public static final int HUNDRED = 100;
    public static final int TWOHUNDRED = 200;
    public static final int FIVEHUNDRED = 500;
    */

    private int amount;

    public Money () {
    }

    /*
    private Money(int sum) {
        this.amount = sum;
    }
    */

    public int getMoney(int sum) throws NotEnoughFundsException{
        if (this.amount < sum) {
            throw new NotEnoughFundsException("NotEnoughFunds");
        }
        return amount;
    }

    public void setMoney(int sum) {
        this.amount += sum;
    }
}
