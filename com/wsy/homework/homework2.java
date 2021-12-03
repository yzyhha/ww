package com.wsy.homework;

public class homework2 {
    public static void main(String[] args) {
        A02 a02 = new A02();
        String[] b = {"435","656","754","43","2","3"};
       int a = a02.find("656",b);
        System.out.println(a);


    }
}
class A02{
    public int find(String a,String[] nums){
        for (int i = 0; i < nums.length; i++) {
            if(a.equals(nums[i])){
            return i;
            }
        }
        return -1;
    }


}
