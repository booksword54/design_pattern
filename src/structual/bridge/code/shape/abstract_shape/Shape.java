package structual.bridge.code.shape.abstract_shape;

import structual.bridge.code.draw_api.abstract_draw_api.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
