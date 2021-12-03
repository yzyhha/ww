package com.wsy.homework;

public class homework3 {
    public static void main(String[] args) {
    Book book = new Book("西游记",220);
    book.info();
    book.UpdatePrice();
    book.info();


    }
}
class Book{
    String Name;
    double prices;
    public Book(String name,double prices){
        this.Name = name;
        this.prices = prices;
    }
    public void UpdatePrice(){
        if(this.prices>150){
            this.prices = 150;
        }else this.prices=prices;
    }
    public void info(){
        System.out.println("书籍的题目为"+this.Name+"书籍价格为："+this.prices);
    }


    }

