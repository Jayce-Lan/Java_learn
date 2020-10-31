package ObjectAPI.interfaceDemo.demo2;

public class GoldenMonkey extends Animal implements Protectable, Valueble {

    @Override
    public void enjoy() {
        System.out.println("the golden monkey is so fun");
    }

    @Override
    public void beProtectable() {
        System.out.println("live in the room");
    }

    @Override
    public double getMoney() {
        return 10000;
    }
}
