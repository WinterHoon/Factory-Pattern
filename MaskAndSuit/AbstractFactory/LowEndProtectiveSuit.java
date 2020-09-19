package MaskAndSuit.AbstractFactory;

public class LowEndProtectiveSuit implements ProtectiveSuit {
    @Override
    public void show() {
        System.out.println("我是低端防护服");
    }
}
