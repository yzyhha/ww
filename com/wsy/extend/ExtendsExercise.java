package com.wsy.extend;

public class ExtendsExercise {
    public static void main(String[] args) {
        PC pc = new PC("i7","256","zz","小米");
        NotePad notePad = new NotePad("i5","64","128","黑色");
      pc.info();

    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hard_disk;

    public Computer(String cpu, String memory, String hard_disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hard_disk = hard_disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHard_disk() {
        return hard_disk;
    }

    public void setHard_disk(String hard_disk) {
        this.hard_disk = hard_disk;
    }
    public String getDetails(){
      return  "电脑配置为："+" cpu为 "+ cpu + " 硬盘为 " + hard_disk +" 内存为 " + memory;
    }
}
class PC extends Computer{
    private String brand;

    public PC(String cpu, String memory, String hard_disk, String brand) {
        super(cpu, memory, hard_disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void info(){
        System.out.println("pc信息为"+getDetails()+"品牌为"+brand);

    }
}
class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, String memory, String hard_disk, String color) {
        super(cpu, memory, hard_disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

