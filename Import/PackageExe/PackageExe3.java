package Import.PackageExe;
//吃水果
public class PackageExe3 {
    public static void main(String[] args) {
        People people = new People();
        people.eat(new Fruit(){

            @Override
            String getFruit() {
                return "苹果";
            }
        }
        );

    }
}
abstract class Fruit{
    abstract String getFruit();

}
class People{
    public void eat(Fruit fruit){
        System.out.println("这个人正在吃"+fruit.getFruit());


    }}
