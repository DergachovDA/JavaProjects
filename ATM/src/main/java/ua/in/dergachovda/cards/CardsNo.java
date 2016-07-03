package ua.in.dergachovda.cards;

public class CardsNo {

    private int value;

    public CardsNo(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
