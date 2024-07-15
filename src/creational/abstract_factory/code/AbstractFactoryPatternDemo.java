package creational.abstract_factory.code;

import creational.abstract_factory.code.factory.ColorFactory;
import creational.abstract_factory.code.factory.ShapeFactory;
import creational.abstract_factory.code.factory.abstract_factory.AbstractFactory;
import creational.abstract_factory.code.product.abstract_product.Color;
import creational.abstract_factory.code.product.abstract_product.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = getFactory("SHAPE");
        assert shapeFactory != null;
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory colorFactory  = getFactory("COLOR");
        assert colorFactory != null;
        Color green = colorFactory.getColor("Green");
        green.fill();
        Color red = colorFactory.getColor("RED");
        red.fill();
    }

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }

}
