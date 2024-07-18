package structual.facade.code.shape;


import structual.facade.code.shape.abstract_shape.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
