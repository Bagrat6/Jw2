package com.aca.week5.homework5.task2;

public class AssertionUtils {
    public static void assertEquals(int val1, int val2){
        if(val1 != val2){
            throw new RuntimeException("Not equal.");
        }
    }

    public static void assertEquals(double val1, double val2){
        if(val1 != val2){
            throw new RuntimeException("Not equal.");
        }
    }

    public static void assertEquals(String val1, String val2){
        if (!(val1.equals(val2))){
            throw new RuntimeException("Not equal");
        }
    }

    public static void assertEquals(boolean val1, boolean val2){
        if(val1 != val2){
            throw new RuntimeException("Not equal.");
        }
    }

    public static void assertNotNull(Object obj){
        if(obj == null){
            throw new RuntimeException("obj is null.");
        }
    }

}
