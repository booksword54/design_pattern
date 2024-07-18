package creational.prototype.code.cache;

import creational.prototype.code.object.Rectangle;
import creational.prototype.code.object.Square;
import creational.prototype.code.object.prototype.Shape;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cache = shapeMap.get(shapeId);
        return (Shape) cache.clone();
    }

    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
    }
}
