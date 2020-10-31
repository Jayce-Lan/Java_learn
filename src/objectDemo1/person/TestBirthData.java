package objectDemo1.person;

public class TestBirthData {
    public static void main(String[] args) {
        TestBirthData tbd = new TestBirthData();
        int data = 9;
        BirthData b1 = new BirthData(1995, 10, 24);
        BirthData b2 = new BirthData(2000, 1, 1);
        tbd.change1(data);
//        tbd.change2(b1);
        tbd.change3(b2);
        b1.display();
        b2.display();
    }

    public void change1(int i) {
        i = 1234;
    }

    public void chang2(BirthData b) {
        b = new BirthData(2020, 10, 24);
    }

    public void change3(BirthData b) {
        b.setDay(22);
    }
}