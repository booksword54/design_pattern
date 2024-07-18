package structual.bridge.code;

import structual.bridge.code.draw_api.GreenCircleDrawAPI;
import structual.bridge.code.draw_api.RedCircleDrawAPI;
import structual.bridge.code.shape.Circle;
import structual.bridge.code.shape.abstract_shape.Shape;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircleDrawAPI());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircleDrawAPI());

        redCircle.draw();
        greenCircle.draw();
    }
}
