package com.aca.week9.homework;

public class fileGeneratorRunnable {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            Runnable runnable1 = new RunnableImpl("C:\\Users\\bagra\\IdeaProjects\\Jw2\\src\\com\\aca\\week9\\homework\\file" + i + ".txt");
            runnable1.run();
        }
    }
}
