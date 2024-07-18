package structual.decorator.code;

import structual.decorator.code.decorator.RedShapeDecorator;
import structual.decorator.code.shape.Circle;
import structual.decorator.code.shape.Rectangle;
import structual.decorator.code.shape.abstract_shape.Shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
