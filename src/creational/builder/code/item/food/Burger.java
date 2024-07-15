package creational.builder.code.item.food;

import creational.builder.code.item.food.abstract_food.Food;

public class Burger extends Food {
    @Override
    public String name() {
        return "Burger ";
    }

    @Override
    public Float price() {
        return 25.0f;
    }
}
