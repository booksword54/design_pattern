package creational.abstract_factory.code.product.color;

import creational.abstract_factory.code.product.abstract_product.Color;

public class GreenColor implements Color {
    @Override
    public void fill() {
        System.out.println("GreenColor::fill()");
    }
}
