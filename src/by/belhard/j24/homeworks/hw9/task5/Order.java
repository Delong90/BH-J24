package by.belhard.j24.homeworks.hw9.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

    private final String nameOfFriend;

    private final List<String> goods = new ArrayList<>();

    // raw data
    public Order(String nameOfFriend, String good, String... goods) {
        this.nameOfFriend = nameOfFriend;

        this.goods.add(good);
        this.goods.addAll(Arrays.asList(goods));
    }

    public List<String> getGoods() {
        return goods;
    }
}
