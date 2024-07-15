package creational.factory.code.product;

import creational.factory.code.product.abstract_product.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
