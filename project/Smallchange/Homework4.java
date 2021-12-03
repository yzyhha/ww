package project.Smallchange;

public class Homework4 {
    public static void main(String[] args) {
        worker worker = new worker(5000);
        worker.printSa();
        Science science = new Science(5000, 10000);
        science.printSa();
        Teacher1 ta = new Teacher1(5000,20,100);
        ta.printSa();



    }
}
class staff{
    public staff(double salary) {
        this.salary = salary;
    }

    private double salary;
    public void printSa(){
        System.out.println("基本工资为"+salary);

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class worker extends staff{
    public worker(double salary) {
        super(salary);
    }

    @Override
    public void printSa() {
        System.out.println("工人");
        super.printSa();
    }
}
class peasant extends staff{
    public peasant(double salary) {
        super(salary);
    }

    @Override
    public void printSa() {
        System.out.println("农民");
        super.printSa();
    }
}
class waiter extends staff{
    public waiter(double salary) {
        super(salary);
    }

    @Override
    public void printSa() {
        System.out.println("服务生");
        super.printSa();
    }
}
class Science extends staff {
    //年终奖
    private double bonus;

    public Science(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public void printSa() {
        System.out.println("科学家");
        super.printSa();
        System.out.println("年终奖"+bonus+"总共"+(getSalary()+bonus));
    }
}
class Teacher1 extends staff{
    //定义日新和天数
    private int classDay;
    private double classSal;

    public Teacher1(double salary, int classDay, double classSal) {
        super(salary);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    @Override
    public void printSa() {
        System.out.println("教师");
        super.printSa();
        System.out.println("课酬为"+classDay*classSal+" 总共为"+(classDay*classSal+getSalary()));

    }
}
