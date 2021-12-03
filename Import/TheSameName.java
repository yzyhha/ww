package Import;

public class TheSameName {
    private int x = 7;
    private class inner{
        private int x = 9;
        public void doit(){
            int x = 11;

            System.out.println(x++);//变量
            System.out.println(this.x++);//内部类
            System.out.println(TheSameName.this.x++);//外部类

        }
    }

    public static void main(String[] args) {
        TheSameName theSameName = new TheSameName();
        TheSameName.inner inner = theSameName.new inner();
        inner.doit();

    }
}
