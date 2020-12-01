package simulationJDBC;

//实现类 数据库厂家负责实现JDBC接口，实现类被称为驱动

public class MySQL implements JDBC {
    @Override
    public void getConnection() {
        //这里的逻辑代码涉及到数据库底层实现原理，但是与Java程序员无关
        System.out.println("连接MySQL成功...");
    }
}
