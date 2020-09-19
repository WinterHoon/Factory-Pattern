package MaskAndSuit.SimpleFactoryPattern;

public class Test {
    public static void main(String[] args) {
        MaskFactory factory = new MaskFactory();
        Mask maskA = factory.createMask("高端口罩");
        Mask maskB = factory.createMask("低端口罩");
        maskA.show();
        maskB.show();
    }
}
