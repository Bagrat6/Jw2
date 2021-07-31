package com.aca.week4.homework04;

import java.util.Scanner;

public class Unboxing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer integer = 1;
        while (integer >= 0){
            System.out.println("Generate random negative number: ");
            integer = scanner.nextInt();
        }
        int abs = absNumber(integer);
        System.out.println(abs);
    }
    public static Integer absNumber(Integer number){
        return number * (-1);
    }

}
