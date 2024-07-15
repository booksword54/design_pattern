package creational.builder.code.builder;

import creational.builder.code.item.Meal;
import creational.builder.code.item.drink.Coffee;
import creational.builder.code.item.drink.Cola;
import creational.builder.code.item.food.Burger;
import creational.builder.code.item.food.Pizza;

public class MealBuilder {

    public Meal prepareAmericanMeal() {
        Meal meal = new Meal();
        meal.addFoodAndDrink(new Burger());
        meal.addFoodAndDrink(new Cola());
        return meal;
    }

    public Meal prepareItalianMeal (){
        Meal meal = new Meal();
        meal.addFoodAndDrink(new Pizza());
        meal.addFoodAndDrink(new Coffee());
        return meal;
    }
}
