package Import.PackageExe;
//匿名内部类实现小狗跑
public class PackageExe4 {
    public static void main(String[] args) {
        Moveable moveable = new Moveable() {
            @Override
            public void run() {
                System.out.println("小狗向前跑");
            }
        };
        moveable.run();
    }
}
interface Moveable{
    void run();

}
