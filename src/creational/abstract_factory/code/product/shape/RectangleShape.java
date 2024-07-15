package creational.abstract_factory.code.product.shape;

import creational.abstract_factory.code.product.abstract_product.Shape;

public class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("RectangleShape::draw()");
    }
}
