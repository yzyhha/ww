package project.Smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        //接受用户的选择
        Scanner sc = new Scanner(System.in);
        String Handing = "===============零钱通明细";
        //消费或支出
        double money = 0;
        //余额
        double balence = 0;
        //日期
        Date date = null;
        //商家
        String shop = " ";
        //日期的格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");



        do {
            System.out.println("\n---------零钱通菜单------");
            System.out.println("\t\t\t1 零钱通明细       ");
            System.out.println("\t\t\t 2 收益入账         ");
            System.out.println("\t\t\t 3 消费             ");
            System.out.println("\t\t\t4 退出             ");
            System.out.print("请选择1-4：");
            int ac = sc.nextInt();
            switch (ac) {
                //明细模块
                case 1:
                    System.out.println(Handing);
                    break;
                    //收入模块
                case 2:
                    System.out.print("请输入收入：");
                    //输入收入金额
                    money = sc.nextDouble();
                    //获取当前时间
                    date = new Date();
                    //判断填写的金额是否正确
                    if (money < 0) {
                        System.out.println("收入不能小于0元");
                        break;
                    }
                    //余额更新
                    balence += money;
                    //消费明细的字符串拼接实现明细更新
                    Handing += "\n收益入账\t+" + money +"\t"+ simpleDateFormat.format(date) + "  余额为  " + balence;
                    System.out.println("您收入了" + money);

                    break;
                    //消费模块
                case 3:
                    System.out.print("请输入消费商家");
                    shop = sc.next();
                    System.out.print("请输入消费金额");
                    money = sc.nextDouble();
                    if (money < 0 || money>balence) {
                        System.out.println("消费应该在0-"+balence);
                        break;
                    }
                    date = new Date();
                    balence-=money;
                    Handing +="\n"+shop+"\t-" + money +"\t"+ simpleDateFormat.format(date) + "  余额为  " + balence;

                    break;
                    //退出模块
                case 4:
                    //接受用户退出
                    String ss = "";
                    do{
                        System.out.println("你确定要退出吗 y/n");
                        //用户输入
                        ss = sc.next();
                        //判断用户输入的是不是y或者n
                        if(ss.equals("y") || ss.equals("n")){
                            break;
                        }
                        //当用户输入y时退出
                        if (ss.equals("y")){
                            System.out.println("已退出");
                            loop = false;
                        }
                    }while (loop);

                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        } while (loop);
    }

}

