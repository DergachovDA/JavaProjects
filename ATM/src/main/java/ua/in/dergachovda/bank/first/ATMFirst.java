package ua.in.dergachovda.bank.first;

import ua.in.dergachovda.bank.ATM;
import ua.in.dergachovda.cards.Card;
import ua.in.dergachovda.bank.Bank;
import ua.in.dergachovda.cards.ExpiresEnd;
import ua.in.dergachovda.money.Money;

import java.util.Date;

public class ATMFirst implements ATM {

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
    public boolean isValidCard() {
        return currentCard.isValid(new Date());
    }

    public boolean verificationCard(String pin) {
        return bank.verificationCard(currentCard, pin);
    }

    @Override
    public boolean setCard(Card card) {
        if (currentCard != null) {
            return false;
        }
        currentCard = card;
        return true;
    }

    @Override
    public Bank getBank() {
        return bank;
    }
}
