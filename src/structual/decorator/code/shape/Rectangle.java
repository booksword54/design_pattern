package structual.decorator.code.shape;

import structual.decorator.code.shape.abstract_shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
