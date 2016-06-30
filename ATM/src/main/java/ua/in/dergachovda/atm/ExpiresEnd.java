package ua.in.dergachovda.atm;

public class ExpiresEnd {
    private int month;
    private int year;

    public ExpiresEnd(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return month + "/" + year;
    }
}
