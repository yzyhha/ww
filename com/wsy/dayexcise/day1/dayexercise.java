package com.wsy.dayexcise.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


class test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期 yyyy-MM-dd");
        String d2 = sc.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d3 = simpleDateFormat.parse(d2);
        long baseDate = d3.getTime();
        long nowTime = System.currentTimeMillis();
        long time = nowTime -baseDate;
        long day = time/1000/60/60/24;
        System.out.println("你活了"+day+"天");


    }


}








