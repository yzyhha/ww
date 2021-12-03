package project.Smallchange;

public class Homework3 {
    public static void main(String[] args) {
        professor professor = new professor("ww",77,"教授",10000,1.3);
        professor.introduce();

    }

}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;

    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("教师名字为：" + name + "教师年龄为：" + age + "教师职位为：" + post + "教师基本工资为" + salary+ "职位工资" + getSalary() * grade);

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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class professor extends Teacher {

    public professor(String name, int age, String post, double salary,double grade) {
        super(name, age, post, salary,grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授类");
        super.introduce();
    }
}