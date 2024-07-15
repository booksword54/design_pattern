package creational.builder.code.item.drink;

import creational.builder.code.item.drink.abstract_drink.Drink;

public class Cola extends Drink {
    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public Float price() {
        return 25.0f;
    }
}
