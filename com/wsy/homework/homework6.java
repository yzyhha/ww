package com.wsy.homework;

public class homework6 {
    public static void main(String[] args) {
        Cale cale = new Cale(6,0);
        System.out.println(cale.add());
        System.out.println(cale.min());
        System.out.println(cale.mul());
        double shang=-1;
        if (shang == cale.div()){
            System.out.println("除数不能为0");
        }else System.out.println(cale.div());



    }
}
class Cale{
    int a,b;
    public Cale(int a,int b) {
        this.a = a;
        this.b = b;
    }
    int add(){
        return a+b;
    }
    int min(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    double div(){
        if(b == 0){
            return -1;
        }else return a/b;

    }
}