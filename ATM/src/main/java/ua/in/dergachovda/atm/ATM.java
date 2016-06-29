package ua.in.dergachovda.atm;

public interface ATM {
    public Money getMoney();
    public void addMoney(Money money);
    public void addMoney(Currency... args);
    public boolean readCard(Card card);
}
