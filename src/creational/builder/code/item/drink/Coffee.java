package creational.builder.code.item.drink;

import creational.builder.code.item.drink.abstract_drink.Drink;

public class Coffee extends Drink {
    @Override
    public String name() {
        return "Coffee";
    }

    @Override
    public Float price() {
        return 25.0f;
    }
}
