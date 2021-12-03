package Import.PackageExe;
//划火柴
public class PackageExe1 {
    public static void main(String[] args) {
        new lit(){

            @Override
            public void fire() {
                System.out.println("火柴被点燃了");
            }

        }.fire();

    }



}
interface lit{
    void fire();
}

