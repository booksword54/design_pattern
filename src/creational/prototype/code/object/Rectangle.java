package creational.prototype.code.object;

import creational.prototype.code.object.prototype.Shape;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    protected void draw() {
        System.out.println("Rectangle::draw()");
    }

}
