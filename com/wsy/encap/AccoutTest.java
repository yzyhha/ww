package com.wsy.encap;

public class AccoutTest {
    public String name;
    private double balance;
    private String password;

    public AccoutTest() {
    }

    public AccoutTest(String name, double balance, String password) {
        this.setName(name);
        this.setPassword(password);
        this.setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <=4 ){
            this.name = name;
        }else {
            System.out.println("请输入字符在2-4的姓名");
            this.name = "无名";
        }

    }

    public double getBalance() {
        if(balance>20){
            return balance;
        }else {
            System.out.println("余额必须大于20");
            return 0;
        }

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if(password.length() == 6){
            this.password = password;
        }else {
            System.out.println("密码必须为6位（默认为123456）");
            this.password = "123456";
        }
    }
    public void info(){
        System.out.println("账号信息："+" 姓名 "+name+" 余额 "+balance+" 密码 "+password);

    }
}
