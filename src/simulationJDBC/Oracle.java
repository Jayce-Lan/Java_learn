package simulationJDBC;

public class Oracle implements JDBC {
    @Override
    public void getConnection() {
        System.out.println("连接Oracle成功...");
    }
}
