package creational.factory.code.product;

import creational.factory.code.product.abstract_product.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("RectangleShape::draw()");
    }
}
