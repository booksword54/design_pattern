package structual.decorator.code.shape;

import structual.decorator.code.shape.abstract_shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
