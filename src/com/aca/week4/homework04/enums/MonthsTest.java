package com.aca.week4.homework04.enums;

public class MonthsTest {
    public Months getMonth(int index){
        if (index < 1 && index > 12){
            throw new RuntimeException("");
        }
        Months months = Months.values()[index - 1];
        return months;
    }

    public static void main(String[] args) {
        MonthsTest monthsTest = new MonthsTest();
        System.out.println(monthsTest.getMonth(8));
    }
}
