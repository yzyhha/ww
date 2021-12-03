package com.wsy.TM.sl.AbstractExe;
//餐馆点菜
public class AbsractExercise4 {
    public static void main(String[] args) {
    Person P1 = new Teacher();  //向上转型
//    Teacher teacher =(Teacher)P1 ;   //向下转型
    Person P2 = new Doctor();
//    Doctor doctor = (Doctor) P2;
    Person P3 = new Student();
//   Student student = (Student) P3;
    ((Teacher) P1).order();
    ((Doctor) P2).order();
    ((Student) P3).order();



    }
}
class Person{
}
class Teacher extends Person{
    public void order(){
        System.out.println("老师点了香辣肉丝");
    }
}
class Student extends Person{
    public void order(){
        System.out.println("学生点了火爆腰花");
    }
}
class Doctor extends Person{
    public void order(){
        System.out.println("医生点了麻辣香锅");

    }

}



