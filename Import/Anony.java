package Import;
//匿名内部类
public class Anony {


    public static void main(String[] args) {
        Animal a = new Animal() {//匿名内部类
            @Override
            public void eat() {
                System.out.println("狗吃肉");
            }

        };
        a.eat();
        a.eat();
    }



}
class Animal{
    void eat(){}
}

