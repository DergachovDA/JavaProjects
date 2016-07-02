package ua.in.dergachovda.atm;

public interface ATM {
    public Money getMoney();
    public void addMoney(Money money);
    public boolean readCard(Card card);
    public boolean setCard(Card card);
    public boolean isValidCard(Card card);
    public Card getCurrentCard();
    public Bank getBank();
}
