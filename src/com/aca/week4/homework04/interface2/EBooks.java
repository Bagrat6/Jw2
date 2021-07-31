package com.aca.week4.homework04.interface2;

public class EBooks implements Book{
    private int numberPages;
    private String author;
    private double sizeMB;
    private Genre genre;

    public void setNumberPages(int numberPages) {
        if(numberPages < 1){
            throw new RuntimeException();
        }
        this.numberPages = numberPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSizeMB(double sizeMB) {
        this.sizeMB = sizeMB;
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

    public double getSizeMB() {
        return sizeMB;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public void browsePages() {

    }

    @Override
    public void open() {
        System.out.println("Ebook is opened.");
    }

    @Override
    public void close() {
        System.out.println("Ebook is closed.");
    }
}
