package MaskAndSuit.FactoryMethod;

public class Test {
    public static void main(String[] args) {
        MaskFactory factoryA = new HighEndFactory();
        MaskFactory factoryB = new LowEndFactory();
        Mask maskA = factoryA.createMask();
        Mask maskB = factoryB.createMask();
        maskA.show();
        maskB.show();
    }
}
