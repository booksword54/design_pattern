package creational.builder.code.item.food.abstract_food;

import creational.builder.code.item.abstract_item.FoodAndDrink;
import creational.builder.code.item.abstract_item.Packaging;
import creational.builder.code.item.packaging.Carton;

public abstract class Food implements FoodAndDrink {

    @Override
    public Packaging packaging() {
        return new Carton();
    }

}
