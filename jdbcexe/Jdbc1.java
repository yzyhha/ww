package jdbcexe;

import java.sql.*;

public class Jdbc1 {
    public static void main(String[] args) {
        Jdbc1.AddDate(5, "python", "555555");
        Jdbc1.DeletDate(5);
        Jdbc1.UpDate("web",2);
        Jdbc1.GetAllDate();


    }
//查询
    public static void GetAllDate() {
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到驱动");
        }
        //设置url
        String url = "jdbc:mysql://localhost:3306/taobao?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        //数据库用户
        String username = "root";
        //密码
        String password = "123456";
        try {
            //数据库连接
            Connection con = DriverManager.getConnection(url, username, password);
            //sql语句
            String sql = "select * from user order by id";
            //准备命令
            Statement statement = con.createStatement();
            //执行
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String title = resultSet.getString("name");
                String pwd = resultSet.getString("password1");
                System.out.println(id + " : " + title + " : " + pwd);

            }
            resultSet.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//添加
    public static void AddDate(Integer id, String name, String title) {
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到驱动");
        }
        //设置url
        String url = "jdbc:mysql://localhost:3306/taobao?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        //数据库用户
        String username = "root";
        //密码
        String password = "123456";
        try {
            //数据库连接
            Connection con = DriverManager.getConnection(url, username, password);
            //sql语句
            String sql = "insert into `user` (`id`,`name`,`password1`) values(?,?,?)";
            //准备发送命令
            PreparedStatement statement = con.prepareStatement(sql);
            //设置参数
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, title);
            //执行命令
            statement.execute();
            //关闭连接
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //删除

    public static void DeletDate(Integer id) {
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到驱动");
        }
        //设置url
        String url = "jdbc:mysql://localhost:3306/taobao?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        //数据库用户
        String username = "root";
        //密码
        String password = "123456";
        try {
            //数据库连接
            Connection con = DriverManager.getConnection(url, username, password);
            //sql语句
            String sql = "delete from user where id=?";
            //准备命令
            PreparedStatement statement = con.prepareStatement(sql);
            //设置参数
            statement.setInt(1, id);
            //执行命令
            statement.execute();
            //关闭连接
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//修改
    public static void UpDate(String name,Integer id) {
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到驱动");
        }
        //设置url
        String url = "jdbc:mysql://localhost:3306/taobao?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        //数据库用户
        String username = "root";
        //密码
        String password = "123456";
        try {
            //数据库连接
            Connection con = DriverManager.getConnection(url, username, password);
            //sql语句
            String sql = "update user set name = ? where id = ?";
            //准备命令
            PreparedStatement statement = con.prepareStatement(sql);
            //设置参数
             statement.setString(1, name);
            statement.setInt(2, id);

            //执行命令
            statement.execute();
            //关闭连接
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

