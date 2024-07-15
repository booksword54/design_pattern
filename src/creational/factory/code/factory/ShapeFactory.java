package creational.factory.code.factory;

import creational.factory.code.product.Rectangle;
import creational.factory.code.product.Square;
import creational.factory.code.product.abstract_product.Shape;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
