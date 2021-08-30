package com.aca.week5.homework5.task2;

import java.util.Objects;

public final class ImmutablePoint implements Point{
    private int x;
    private int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint(ImmutablePoint immutablePoint){
        this.x = immutablePoint.getX();
        this.y = immutablePoint.getY();
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public Point shiftLeft(){
        return new ImmutablePoint(getX() - 1, getY());
    }

    public Point shiftRight(){
        return new ImmutablePoint(getX() + 1, getY());
    }

    public Point shiftUp(){
        return new ImmutablePoint(getX(), getY() + 1);
    }

    public Point shiftDown(){
        return new ImmutablePoint(getX(), getY() - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutablePoint)) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return x == that.x && y == that.y;
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
