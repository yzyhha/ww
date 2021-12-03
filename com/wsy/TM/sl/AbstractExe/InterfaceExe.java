package com.wsy.TM.sl.AbstractExe;

public class InterfaceExe {
    public static void main(String[] args) {
        RedLight redLight = new RedLight();
        YellowLight yellowLight = new YellowLight();
        GreenLight greenLight = new GreenLight();
        redLight.shine();
        yellowLight.shine();
        greenLight.shine();
    }
}

interface Colorful {
    void shine();
}

class RedLight implements Colorful {

    @Override
    public void shine() {
        System.out.println("红灯发红光");
    }
}

class YellowLight implements Colorful {
    @Override
    public void shine() {
        System.out.println("黄灯发黄光");
    }
}
class GreenLight implements Colorful{
    @Override
    public void shine() {
        System.out.println("绿灯发绿光");
    }
}
