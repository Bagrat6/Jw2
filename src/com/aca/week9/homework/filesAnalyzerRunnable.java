package com.aca.week9.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filesAnalyzerRunnable {
    public static void main(String[] args) {
        String []items = {"b8165ac7-0703-406f-ba58-5addc718aeb8", "7d64d24e-311a-40c9-930f-841387a9132a", "cd2f72a0-9ec5-4f34-b970-ba823d74ba1a"};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    BufferedReader bufferedReader = null;

                    try {
                        bufferedReader = new BufferedReader(new FileReader("C:\\Users\\bagra\\IdeaProjects\\Jw2\\src\\com\\aca\\week9\\homework\\file" + i + ".txt"));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    String s;
                    try{
                        s = bufferedReader.readLine();

                        while (s != null){
                            for(String j : items){
                                if(j.equals(s)){
                                    System.out.println("file" + i + " contains " + s);
                                }
                            }

                            s = bufferedReader.readLine();
                        }
                    }catch (IOException e){
                        e.printStackTrace();
                    }

                }
            }
        });
        thread.start();
    }
}
