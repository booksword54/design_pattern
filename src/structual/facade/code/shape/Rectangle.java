package structual.facade.code.shape;

import structual.facade.code.shape.abstract_shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
