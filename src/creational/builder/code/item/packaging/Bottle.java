package creational.builder.code.item.packaging;

import creational.builder.code.item.abstract_item.Packaging;

public class Bottle implements Packaging {
    @Override
    public String name() {
        return "Bottle";
    }
}
