package simulationJDBC;

/*
    调用类 程序员负责调用接口，而不需要再去关心数据库底层的实现类
    面向接口/面向抽象编程
 */

import java.util.ResourceBundle;

public class JavaProgram {

    public static void main(String[] args) throws Exception {
//        JDBC jdbc = new MySQL();
//        JDBC jdbc = new Oracle();
        //由于调用的是接口方法，因此，即使上面的数据库类型更换，也不需要改变下面的调用方法，而是更改数据库类型即可
//        jdbc.getConnection();


        //通过反射机制创建对象
        /*Class c = Class.forName("MySQL");
        JDBC jdbc = (JDBC)c.newInstance();
        jdbc.getConnection();*/

        //配置文件(本文件夹中的jdbc.properties)读取对象
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        //这里获取的是配置文件中的值，由于配置文件都由键值对形成，因此，这里写入的是key，从而获取value
        String className = bundle.getString("className");
//        System.out.println(className);
        Class c = Class.forName(className);
        JDBC jdbc = (JDBC)c.newInstance();
        jdbc.getConnection();
    }
}
