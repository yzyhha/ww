package com.wsy.TM.sl.FinalExe;

public class TrafficRegulations {
    public static void main(String[] args) {
        Passman passman = new Passman("行人");
        System.out.println(passman.fol_thr_rules());
        Car car = new Car("小汽车");
        System.out.println(car.fol_thr_rules());

    }
}

class trafficrules {//交通规则
    String actor;

    public trafficrules(String actor) {
        this.actor = actor;
    }

    public final String fol_thr_rules() {
        return this.actor + "要" + "红灯停，绿灯行";
    }
}

class Passman extends trafficrules {//行人类


    public Passman(String actor) {
        super(actor);
    }
}

class Car extends trafficrules {//汽车类

    public Car(String actor) {
        super(actor);
    }
}