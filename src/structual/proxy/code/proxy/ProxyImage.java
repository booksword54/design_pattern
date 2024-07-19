package structual.proxy.code.proxy;

import structual.proxy.code.image.RealImage;
import structual.proxy.code.image.abstract_image.Image;

public class ProxyImage implements Image {

    private String fileName;

    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}