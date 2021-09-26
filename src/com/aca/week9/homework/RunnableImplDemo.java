package com.aca.week9.homework;

public class RunnableImplDemo {
    public static void main(String[] args) {
        Runnable runnable = new RunnableImpl("C:\\Users\\bagra\\IdeaProjects\\Jw2\\src\\com\\aca\\week9\\homework\\testFile.txt");
        runnable.run();
    }
}
