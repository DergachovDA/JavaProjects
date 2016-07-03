package ua.in.dergachovda.bank;

import ua.in.dergachovda.cards.Card;
import ua.in.dergachovda.bank.Bank;
import ua.in.dergachovda.money.Money;

public interface ATM {
    public Money getMoney();
    public void addMoney(Money money);
    public boolean readCard(Card card);
    public boolean isValidCard(String pin);
    public boolean setCard(Card card);
    public Card getCurrentCard();
    public Bank getBank();
}
