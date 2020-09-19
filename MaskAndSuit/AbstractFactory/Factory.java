package MaskAndSuit.AbstractFactory;

public interface Factory {
    //创建口罩
    Mask createMask();
    //创建防护服
    ProtectiveSuit createSuit();
}
