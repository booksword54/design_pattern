package creational.abstract_factory.code;

import creational.abstract_factory.code.factory.GreenRectangleFactory;
import creational.abstract_factory.code.factory.RedSquareFactory;
import creational.abstract_factory.code.factory.abstract_factory.AbstractFactory;
import creational.abstract_factory.code.product.abstract_product.Color;
import creational.abstract_factory.code.product.abstract_product.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory redSquareFactory = getFactory("RED_SQUARE");
        assert redSquareFactory != null;
        Color red = redSquareFactory.getColor();
        red.fill();
        Shape square = redSquareFactory.getShape();
        square.draw();

        AbstractFactory greenRectangleFactory  = getFactory("GREEN_RECTANGLE");
        assert greenRectangleFactory != null;
        Color green = greenRectangleFactory.getColor();
        green.fill();
        Shape rectangle = greenRectangleFactory.getShape();
        rectangle.draw();
    }

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("RED_SQUARE")) {
            return new RedSquareFactory();
        } else if (choice.equalsIgnoreCase("GREEN_RECTANGLE")) {
            return new GreenRectangleFactory();
        }
        return null;
    }

}
