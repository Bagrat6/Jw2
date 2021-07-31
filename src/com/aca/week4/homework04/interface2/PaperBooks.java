package com.aca.week4.homework04.interface2;

public class PaperBooks implements Book{
    private int numberPages;
    private String author;
    private Genre genre;

    public void setNumberPages(int numberPages) {
        if (numberPages < 1){
            throw new RuntimeException();
        }
        this.numberPages = numberPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public void open() {
        System.out.println("Paper book is opened.");
    }

    @Override
    public void close() {
        System.out.println("Paper book is closed.");
    }

    @Override
    public void browsePages() {
        System.out.println("Paper book is browsing.");
    }
}
