package ua.in.dergachovda.atm;

public class Security {
    private int pin;
    private Card card;

    public Security(Card card) {
        this.card = card;
        pin = 0000;
    }

    public Security(int pin) {
        this.pin = pin;
    }

    public boolean isPinValid(Card card, int pin) {
        return card == this.card && pin == this.pin;
    }
}
