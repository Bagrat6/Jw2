package com.aca.week4.homework04.interface2;

public class Main {
    public static void main(String[] args) {
        EBooks eBooks = new EBooks();
        PaperBooks paperBooks = new PaperBooks();
        eBooks.setAuthor("Anderson");
        eBooks.setGenre(Genre.DRAMA);
        eBooks.setNumberPages(100);
        eBooks.setSizeMB(8.5);

        eBooks.open();
        System.out.println(eBooks.getAuthor());
        System.out.println(eBooks.getGenre());
        System.out.println(eBooks.getNumberPages());
        System.out.println(eBooks.getSizeMB());
        eBooks.close();
    }
}
