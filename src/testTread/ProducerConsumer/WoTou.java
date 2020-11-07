package testTread.ProducerConsumer;

//物品类：需要生产的物品

public class WoTou {
    int id;

    //写一个构造方法，为每个产品做好编号
    public WoTou(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WoTou{" +
                "id=" + id +
                '}';
    }
}
