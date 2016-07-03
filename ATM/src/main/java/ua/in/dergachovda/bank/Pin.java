package ua.in.dergachovda.bank;

import java.util.Arrays;

public class Pin {
    private int value;

    public Pin() {
        value = 0000;
    }

    public boolean verification(String value) {
        return this.value == Integer.valueOf(value);
    }
}
