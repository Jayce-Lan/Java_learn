package testCollection.testGeneric;

//使用了泛型来强制用户传入对象必须为<MyName>

public class MyName implements Comparable<MyName> {
    int age;

    @Override
    public int compareTo(MyName mn) {
        if (this.age > mn.age)
            return 1;
        else if (this.age < mn.age)
            return -1;
        else
            return 0;
    }
}
