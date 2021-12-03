package com.wsy.extend;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        Graduate graduate = new Graduate();
        pupil.name = "小吴";
        pupil.age = 12;
        pupil.testing();
        pupil.setScore(60);
        pupil.showinfo();

        System.out.println("============");
        graduate.name = "王刚";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(120);
        graduate.showinfo();
    }


}
