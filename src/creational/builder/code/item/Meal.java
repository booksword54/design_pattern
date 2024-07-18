package creational.builder.code.item;

import creational.builder.code.item.abstract_item.FoodAndDrink;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<FoodAndDrink> foodAndDrinks = new ArrayList<FoodAndDrink>();

    public void addFoodAndDrink(FoodAndDrink foodAndDrink) {
        foodAndDrinks.add(foodAndDrink);
    }

    public float getCost() {
        float cost = 0.0f;
        for (FoodAndDrink foodAndDrink : foodAndDrinks) {
            cost += foodAndDrink.price();
        }
        return cost;
    }

    public void listFoodAndDrinks() {
        for (FoodAndDrink foodAndDrink : foodAndDrinks) {
            System.out.print("name : "+foodAndDrink.name());
            System.out.print(", packaging : "+foodAndDrink.packaging().name());
            System.out.println(", price : "+foodAndDrink.price());
        }
    }

}
