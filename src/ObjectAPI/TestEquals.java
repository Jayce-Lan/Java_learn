package ObjectAPI;

/**
 * @"=="对比的是对象内存所在的地址
 * @equals()默认的是同一个对象的引用时返回true
 *
 * @equals()可以通过重写来进行重新定义
 */

public class TestEquals {
    public static void main(String[] args) {
        Cat c1 = new Cat(1, 2, 3);
        Cat c2 = new Cat(1, 2, 3);

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1.equals(s2));
    }
}

class Cat {
    int color, height, width;

    public Cat (int color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    /**
     * 重写equals方法
     * @param obj
     * @return
     */
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        else {
            if (obj instanceof Cat) {
                Cat c = (Cat) obj;
                if (c.color == this.color && c.height == this.height && c.width == this.width) {
                    return true;
                }
            }
        }
        return false;
    }
}