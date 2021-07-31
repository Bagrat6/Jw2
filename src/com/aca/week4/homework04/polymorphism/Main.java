package com.aca.week4.homework04.polymorphism;

public class Main {
    public static void main(String[] args) {
        Staff artist = new Artist();
        Staff author = new Author();
        artist.work();
        author.work();
    }
}
