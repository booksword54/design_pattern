package creational.builder.code;

import creational.builder.code.builder.MealBuilder;
import creational.builder.code.item.Meal;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal americanMeal = mealBuilder.prepareAmericanMeal();
        System.out.println("American Meal");
        americanMeal.listFoodAndItems();
        System.out.println("Total Cost: " + americanMeal.getCost());

        System.out.println();

        Meal italianMeal = mealBuilder.prepareItalianMeal();
        System.out.println("Italian Meal");
        italianMeal.listFoodAndItems();
        System.out.println("Total Cost: " + italianMeal.getCost());
    }
}
