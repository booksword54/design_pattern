package creational.builder.code.item.food;

import creational.builder.code.item.food.abstract_food.Food;

public class Pizza extends Food {
    @Override
    public String name() {
        return "Pizza";
    }

    @Override
    public Float price() {
        return 25.0f;
    }
}
