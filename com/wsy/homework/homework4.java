package com.wsy.homework;

public class homework4 {
    public static void main(String[] args) {
        A04 a04 = new A04();
        int[] oldArr = {3,6,9,4,5};
        int[]newArr = a04.copyArr(oldArr);
        System.out.println(oldArr);
        a04.check(oldArr);
        a04.check(newArr);
        System.out.println(newArr);

    }
}
class A04{
   public int[] copyArr(int[] oldArr){
       int[] newArr = new int[oldArr.length];
       for (int i = 0; i <oldArr.length ; i++) {
           newArr[i] =oldArr[i];
       }
    return newArr;
   }
   public void check(int[] a){
       for (int i = 0; i <a.length ; i++) {
           System.out.print(a[i]+" ");
       }
       System.out.println();

   }

}
