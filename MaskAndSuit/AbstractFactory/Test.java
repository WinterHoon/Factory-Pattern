package MaskAndSuit.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        Factory factoryA = new LowEndFactory();
        Factory factoryB = new HighEndFactory();
        Mask maskA = factoryA.createMask();
        Mask maskB = factoryB.createMask();
        ProtectiveSuit suitA = factoryA.createSuit();
        ProtectiveSuit suitB = factoryB.createSuit();

        maskA.show();
        maskB.show();
        suitA.show();
        suitB.show();
    }
}
