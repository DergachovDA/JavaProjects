package ua.in.dergachovda.bank;

import ua.in.dergachovda.cards.Card;
import ua.in.dergachovda.cards.CardsNo;

public interface Security {
    public void add(CardsNo cardsNo, Pin pin);
    public boolean verification (Card card, String pin);
}
