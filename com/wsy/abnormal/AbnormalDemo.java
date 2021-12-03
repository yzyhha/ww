package com.wsy.abnormal;

public class AbnormalDemo {
    public static void main(String[] args) {
       try {
           int result = 3;

        System.out.println(result);
        int a = Integer.parseInt("20l");
        System.out.println(a);
    } catch (NumberFormatException e) {
           e.printStackTrace();
       }
        System.out.println("program over!");

    }
}
