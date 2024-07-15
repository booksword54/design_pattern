package creational.abstract_factory.code.factory.abstract_factory;

import creational.abstract_factory.code.product.abstract_product.Color;
import creational.abstract_factory.code.product.abstract_product.Shape;

public interface AbstractFactory {
    Color getColor(String color);
    Shape getShape(String shape) ;
}
