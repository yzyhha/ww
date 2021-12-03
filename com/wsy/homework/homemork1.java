package com.wsy.homework;

public class homemork1 {
    public static void main(String[] args) {
    A01 a01=new A01();
//    int[] a = {3,45,6,6,2,8,33};
//    int max = a01.max(a);
        int max = a01.max(1,3,5,7,8,3);
        System.out.println(max);
    }
}
class A01{
    public int max(int... a){
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
        temp =temp>a[i]?temp:a[i];
        }
        return temp;
    }

}
