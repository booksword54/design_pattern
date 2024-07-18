package structual.facade.code.facade;

import structual.facade.code.shape.Circle;
import structual.facade.code.shape.Rectangle;
import structual.facade.code.shape.Square;
import structual.facade.code.shape.abstract_shape.Shape;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
