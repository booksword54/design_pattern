package structual.proxy.code;

import structual.proxy.code.image.abstract_image.Image;
import structual.proxy.code.proxy.ProxyImage;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
    }
}