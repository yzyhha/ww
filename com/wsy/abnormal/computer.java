package com.wsy.abnormal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class computer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入第一个数");
            int sc = scanner.nextInt();
            System.out.println("请输入符号+-*/");
            String fuh = scanner.next();
            System.out.println("请输入第二个数");
            int sc2 = scanner.nextInt();

            int result = 0;
            switch (fuh) {
                case "+":
                    result = sc + sc2;
                    break;
                case "-":
                    result = sc - sc2;
                    break;
                case "*":
                    result = sc * sc2;
                    break;
                case "/":
                    result = sc / sc2;
                    break;
            }
            System.out.println(result);

        } catch (InputMismatchException ime) {
            System.out.println("宁输入了个错误的数，出现了"+ime.toString()+"异常");
        }
        scanner.close();
    }
}
