package structual.bridge.code.draw_api;

import structual.bridge.code.draw_api.abstract_draw_api.DrawAPI;

public class GreenCircleDrawAPI implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
