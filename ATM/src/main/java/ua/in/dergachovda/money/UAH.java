package ua.in.dergachovda.money;

public enum UAH implements Currency{
    ONE(1),
    TOW(2),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100),
    TWO_HUNDRED(200),
    FIVE_HUNDRED(500);

    private int value;

    private UAH(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
