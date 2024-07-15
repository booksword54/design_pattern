package creational.builder.code.item.packaging;

import creational.builder.code.item.abstract_item.Packaging;

public class Carton implements Packaging {
    @Override
    public String name() {
        return "Carton";
    }
}
