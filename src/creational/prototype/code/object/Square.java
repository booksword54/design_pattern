package creational.prototype.code.object;

import creational.prototype.code.object.prototype.Shape;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    protected void draw() {
        System.out.println("Square::draw()");
    }

}
