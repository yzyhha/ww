package Import;

public class Person {
    Heart heart = new Heart();

    class Heart {

        public void jump() {
            System.out.println("心脏在跳动");

        }
    }

    public void walk() {
        System.out.println("人在走路");
        heart.jump();


    }


    public static void main(String[] args) {
        Person person = new Person();
        person.walk();

    }

}
