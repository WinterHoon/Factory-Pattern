package MaskAndSuit.FactoryMethod;

public class LowEndFactory implements MaskFactory {
    public Mask createMask() {
        Mask mask = new LowEndMask();
        //...
        //一百行低端口罩的初始化代码
        return mask;
    }
}
