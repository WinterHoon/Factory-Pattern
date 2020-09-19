package MaskAndSuit.SimpleFactoryPattern;

public class LowEndMask implements Mask {
    @Override
    public void show() {
        System.out.println("我是低端口罩");
    }
}
