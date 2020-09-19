package MaskAndSuit.AbstractFactory;

public class LowEndFactory implements Factory {
    @Override
    public Mask createMask() {
        Mask mask = new LowEndMask();
        //...
        //低端口罩的一百行初始化代码
        return mask;
    }

    @Override
    public ProtectiveSuit createSuit() {
        ProtectiveSuit suit = new LowEndProtectiveSuit();
        //...
        //低端防护服的一百行初始化代码
        return suit;
    }
}
