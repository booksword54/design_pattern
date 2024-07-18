package creational.prototype.code;

import creational.prototype.code.cache.ShapeCache;
import creational.prototype.code.object.prototype.Shape;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShapeA = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShapeA.getType());

        Shape clonedShapeB = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShapeB.getType());
    }
}
