package MaskAndSuit.VerySimpleFactoryPattern;

public class MaskFactory {
    public Mask createMask() {
        Mask mask = new Mask();
        //...
        //100行初始化代码
        return mask;
    }
}

//这就是最最简单的工厂模式，叫简单工厂模式