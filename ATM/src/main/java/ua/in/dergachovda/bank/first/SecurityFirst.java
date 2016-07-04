package ua.in.dergachovda.bank.first;

import ua.in.dergachovda.bank.Pin;
import ua.in.dergachovda.cards.Card;
import ua.in.dergachovda.cards.CardsNo;

import java.util.HashMap;
import java.util.Map;


public enum SecurityFirst implements ua.in.dergachovda.bank.Security {

    BASE();

    private Map<CardsNo, Pin> pins;

    private SecurityFirst() {
        pins = new HashMap<>();
    }

    @Override
    public void add(CardsNo cardsNo, Pin pin) {
        pins.put(cardsNo, pin);
    }

    @Override
    public boolean verification(Card card, String pin) {
        return pins.get(card.getCardsNo()).verification(pin);
    }

}
