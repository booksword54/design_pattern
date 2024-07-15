package creational.abstract_factory.code.factory;

import creational.abstract_factory.code.factory.abstract_factory.AbstractFactory;
import creational.abstract_factory.code.product.abstract_product.Color;
import creational.abstract_factory.code.product.abstract_product.Shape;
import creational.abstract_factory.code.product.color.RedColor;
import creational.abstract_factory.code.product.shape.SquareShape;

public class RedSquareFactory implements AbstractFactory {
    @Override
    public Color getColor() {
        return new RedColor();
    }

    @Override
    public Shape getShape() {
        return new SquareShape();
    }
}
