package ua.in.dergachovda.atm;

import java.util.HashMap;
import java.util.Map;

public class Money {
    private HashMap<Currency, Integer> money;

    Money() {
        this.money = new HashMap<Currency, Integer>();
    }

    public int getAmount () {
        int sum = 0;
        for (Map.Entry<Currency, Integer> entry : money.entrySet()) {
            Currency currency = (Currency) entry.getKey();
            int n = (Integer) entry.getValue();
            sum += currency.getValue() * n;
        }
        return sum;
    }

    private HashMap<Currency, Integer> getMoney() {
        return this.money;
    }

    public void addMoney(Money money) {
        this.money.putAll(money.getMoney());
    }
}
