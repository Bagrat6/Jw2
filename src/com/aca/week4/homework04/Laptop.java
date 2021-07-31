package com.aca.week4.homework04;

public class Laptop {
    private int value;

    static int counterPublic;
    static int counterProtected;

    public Laptop() {
        counterPublic++;
    }

    protected Laptop(int value) {
        this.value = value;
        counterProtected++;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int getCounterPublic() {
        return counterPublic;
    }

    public static int getCounterProtected() {
        return counterProtected;
    }
}
