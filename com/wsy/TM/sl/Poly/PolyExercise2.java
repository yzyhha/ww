package com.wsy.TM.sl.Poly;

public class PolyExercise2 {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        RedLight redLight = new RedLight();
        YellowLight yellowLight = new YellowLight();
        GreenLight greenLight = new GreenLight();
        lighten(redLight);
        lighten(yellowLight);
        lighten(greenLight);

    }
    public static void lighten(TrafficLight light){
        if (light instanceof RedLight){
            System.out.println("红灯亮45秒");
        }else if(light instanceof YellowLight){
            System.out.println("黄灯亮5秒");
        }else {
            System.out.println("绿灯亮30秒");
        }
    }
}
class TrafficLight{//交通灯类
}
class RedLight extends TrafficLight{}//红灯类
class YellowLight extends TrafficLight{}//黄灯类
class GreenLight extends TrafficLight{}//绿灯类
