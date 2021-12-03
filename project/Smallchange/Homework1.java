package project.Smallchange;

/**
 * @author yzy
 */
public class Homework1 {
    public static void main(String[] args) {
        Person p1 = new Person("p1", 20, "we");
        Person p2 = new Person("p2", 55, "we");
        Person p3 = new Person("p3", 10, "we");
        Person pw = new Person("p0", 99, "we");

        pw.maopao(p1, p2, p3);


    }

}
class Person{
    private String name;
    private  int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public void maopao(Person p1, Person p2, Person p3){
        Person[] people = {p1,p2,p3};
        for (int i = 0; i <people.length; i++) {
            for (int j = 0; j <people.length ; j++) {
                if (people[i].getAge() > people[j].getAge()){
                    Person pw = people[i];
                    people[i]=people[j];
                    people[j] = pw;
                    System.out.println(people[0]+" "+people[1]+" "+people[2]+"\n");
                }

            }
        }
        for (int j = 0; j <people.length ; j++) {
            System.out.println(people[j].toString());
        }

    }

}
