package creational.builder.code.item.drink.abstract_drink;

import creational.builder.code.item.abstract_item.FoodAndDrink;
import creational.builder.code.item.abstract_item.Packaging;
import creational.builder.code.item.packaging.Bottle;

public abstract class Drink implements FoodAndDrink {

    @Override
    public Packaging packaging() {
        return new Bottle();
    }

}
