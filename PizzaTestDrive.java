public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStypePizzaStore();
        PizzaStore chicagoStore = new ChicagoStypePizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
        
    }
}
