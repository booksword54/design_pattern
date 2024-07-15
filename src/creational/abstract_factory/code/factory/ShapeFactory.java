package creational.abstract_factory.code.factory;

import creational.abstract_factory.code.factory.abstract_factory.AbstractFactory;
import creational.abstract_factory.code.product.abstract_product.Color;
import creational.abstract_factory.code.product.abstract_product.Shape;
import creational.abstract_factory.code.product.shape.RectangleShape;
import creational.abstract_factory.code.product.shape.SquareShape;

public class ShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new RectangleShape();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new SquareShape();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
