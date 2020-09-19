package MaskAndSuit.AbstractFactory;

public class HighEndFactory implements Factory {

    @Override
    public Mask createMask() {
        Mask mask = new HighEndMask();
        //...
        //高端口罩的一百行初始化代码
        return mask;
    }

    @Override
    public ProtectiveSuit createSuit() {
        ProtectiveSuit suit = new HighEndProtectiveSuit();
        //...
        //高端防护服的一百行初始化代码
        return suit;
    }
    
}
