package MaskAndSuit.FactoryMethod;

public class HighEndFactory implements MaskFactory{
    public Mask createMask() {
        Mask mask = new HighEndMask();
        //...
        //一百行高端口罩的初始化代码
        return mask;
    }
}
