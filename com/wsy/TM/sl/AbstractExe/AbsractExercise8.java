package com.wsy.TM.sl.AbstractExe;
//usb充电
public class AbsractExercise8 {
    public static void main(String[] args) {
        Car car = new Car();
        car.charge();

    }
}
interface USBReachargeable{
    void charge();

}
interface TypeCReachargeable{
    void charge();

}


class Car implements USBReachargeable , TypeCReachargeable{

    @Override
    public void charge() {
        System.out.println("汽车上的usb和typec都能给手机充电");
    }
}