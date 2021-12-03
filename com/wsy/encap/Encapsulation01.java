package com.wsy.encap;

import java.util.Scanner;

public class Encapsulation01 {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.setName("aaasssa");
        persion.setAge(18);
        persion.setSalary(30000);
        persion.getSalary();
        persion.setJob("搬砖");
        System.out.println(persion.info());

    }

}

class Persion {
    public String name;
    private int age;
    private double salary;
    private String job;

    public Persion() {
    }

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length()<=6){
            this.name = name;
        }else {
            System.out.println("请输入2-6位的姓名");


        }    }

    public void setAge(int age) {
        if(age>=1 && age<=120){
            this.age = age;
        }else {
            System.out.println("请输入正确的年龄");
        this.age = 18;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码查看");
        int pass  = scanner.nextInt();
        if(pass == 123456){

            return salary;
        }   else return  -1;
    }

    public String getJob() {
        return job;
    }

    public String info() {
        return " 姓名 " + name + " 年龄 " + age + " 薪水 " + salary + " 工作 " + job;
    }

}
