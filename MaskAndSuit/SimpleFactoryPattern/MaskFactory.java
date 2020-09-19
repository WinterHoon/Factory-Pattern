package MaskAndSuit.SimpleFactoryPattern;

public class MaskFactory {
    public Mask createMask(String type) {
        Mask mask = null;
        if ("高端口罩".equals(type)) {
            mask = new HighEndMask();
            //...
            //HighEndMask的一百行初始化代码
        } else if ("低端口罩".equals(type)) {
            mask = new LowEndMask();
            //...
            //LowEndMask的一百行初始化代码
        }
        return mask;
    }
    
}
