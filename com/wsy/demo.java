package com.wsy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        int[] a = {20, 55, 10};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        String File = "C:\\1.txt";
//        List<String> ls = new LinkedList<>();
//        ls.add("ppp");
//        ls.add("qqq");
//        for (String num:ls){
//            System.out.println(num);
//
//        }
//        try {
//            FileWriter fileWriter = new FileWriter(File);
//            fileWriter.write("hello");
//            fileWriter.flush();
//            fileWriter.close();
//            FileReader fileReader = new FileReader(File);
//            char[] buffer = new char[1024];
//            while (fileReader.read(buffer)>0){
//                System.out.println(buffer);
//
//            }
//            fileReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (int temp:a){
//            System.out.println(temp);
//
//        }

        int num = 70;
        System.out.println(num);

        HashMap<String,demoexe> hsdemo = new HashMap<String,demoexe>();
        for (int i = 0; i <10 ; i++) {
            demoexe demo1 = new demoexe();
            demo1.name = "特工"+i;
            demo1.id = "1000"+i;
            demo1.city = "qq";
            demo1.age = 20+i;
            hsdemo.put(demo1.id,demo1);
        }
        String key = "10006";
        demoexe demo2 = hsdemo.get(key);
        System.out.println(demo2.toString());

















    }


}

class a {
    private String name;

    public a(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "a{" +
                "name='" + name + '\'' +
                '}';
    }
}

