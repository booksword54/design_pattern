package structual.bridge.code.shape;

import structual.bridge.code.draw_api.abstract_draw_api.DrawAPI;
import structual.bridge.code.shape.abstract_shape.Shape;

public class Circle extends Shape {

    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
