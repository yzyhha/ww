package com.wsy.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ioexercise1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/text1.txt");
        write(file);
        System.out.println(read(file));


    }
    public static void write(File file) throws IOException{
        OutputStream out = new FileOutputStream(file,true);
        //写入你需要的字符串
        String string = "这是第一个file";
        //写入文件
       out.write(string.getBytes());
       //关闭流
        out.close();
    }
public static String read(File file) throws IOException{
    InputStream in = new FileInputStream(file);
    //读取的大小
    byte[] bytes = new byte[1024];
    StringBuilder stringBuilder = new StringBuilder();
    int lenth;
    while ((lenth = in.read(bytes) )!= -1){
            stringBuilder.append(new String(bytes,0,lenth));
    }
    in.close();
    return stringBuilder.toString();

}

}

