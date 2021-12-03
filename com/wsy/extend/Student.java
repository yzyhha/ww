package com.wsy.extend;

public class Student {
    public String name;
    public int age;
    private double score;





    public void setScore(double score) {
        this.score = score;
    }

    public void showinfo(){
        System.out.println("姓名" + name + "年龄" + age + "成绩"+score);

    }

}
