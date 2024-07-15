package creational.abstract_factory.code.factory;

import creational.abstract_factory.code.factory.abstract_factory.AbstractFactory;
import creational.abstract_factory.code.product.abstract_product.Color;
import creational.abstract_factory.code.product.abstract_product.Shape;
import creational.abstract_factory.code.product.color.GreenColor;
import creational.abstract_factory.code.product.color.RedColor;

public class ColorFactory implements AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new RedColor();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new GreenColor();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}
