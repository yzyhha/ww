package com.wsy.TM.sl.AbstractExe;
//景区游客人数
public class AbsractExercise9 {
    public static void main(String[] args) {
        Numbs numbs = new Numbs();
        numbs.add(7);
        numbs.reduce(4);
        numbs.output();


    }
}
interface Addable{
    int add(int a);
}
interface Reduceable{
    int reduce(int r);
}
interface Changeable{
    int NUIT = 30;
}
class Numbs implements Addable,Reduceable,Changeable{
    static int nums;

    @Override
    public int add(int a) {
        return nums+=a*NUIT;
    }

    @Override
    public int reduce(int r) {
        return nums-=r*NUIT;
    }
    public void output(){
        System.out.println("景区内剩余人数为"+nums);

    }

}


