package creational.abstract_factory.code.factory;

import creational.abstract_factory.code.factory.abstract_factory.AbstractFactory;
import creational.abstract_factory.code.product.abstract_product.Color;
import creational.abstract_factory.code.product.abstract_product.Shape;
import creational.abstract_factory.code.product.color.GreenColor;
import creational.abstract_factory.code.product.shape.RectangleShape;

public class GreenRectangleFactory implements AbstractFactory {
    @Override
    public Color getColor() {
        return new GreenColor();
    }

    @Override
    public Shape getShape() {
        return new RectangleShape();
    }
}
